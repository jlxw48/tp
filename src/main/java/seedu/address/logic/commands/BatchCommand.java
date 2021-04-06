package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import seedu.address.commons.core.LogsCenter;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.shortcut.ShortcutLibrary;

/**
 * Handles all execution of {@code BatchCommand} as well as for {@code EditCommand} or {@code DeleteCommand}.
 *
 * @param <T> the type of {@code Command} that will be executed by {@code BatchCommand}
 */
public class BatchCommand<T extends Command> extends Command {

    public static final String COMMAND_WORD = "batch";
    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Batch operation for all the listed clients.\n"
            + "The same rules apply here, just like for the individual commands.\n"
            + "Parameters: COMMAND (only edit or delete command are supported) "
            + "ARGUMENTS (for the chosen command)\n"
            + "Example: " + COMMAND_WORD + " edit 1, 2 t/colleagues";
    public static final String SUCCESS_MESSAGE = "Batch operation successful!";
    public static final String ERROR_MESSAGE = "Batch operation halted. Error message from batch command: \n%s";

    private final Logger logger = LogsCenter.getLogger(getClass());
    private final List<T> listOfCommands;

    /**
     * Creates a {@code BatchCommand} with a {@code List} of {@code EditCommands} or {@code DeleteCommands} to execute.
     *
     * @param listOfCommands {@code List} of {@code EditCommands} or {@code DeleteCommands} to execute
     */
    public BatchCommand(List<T> listOfCommands) {
        this.listOfCommands = listOfCommands;
    }

    /**
     * Executes the individual commands on a copy to ensure that there are no errors, before proceeding to
     * execute the commands on the real model.
     *
     * @param model {@code Model} which the command should operate on.
     * @return {@code CommandResult} with the successful feedback message.
     * @throws CommandException when are are exceptions thrown by any of the individual commands.
     */
    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        try {
            // Execute on the copy first to check for errors
            Model copy = new ModelManager(model.getAddressBook(), model.getUserPrefs(), new ShortcutLibrary());

            for (Command command : listOfCommands) {
                command.execute(copy);
            }

            // If successfully executed on copy, we can now execute on model without worrying about exceptions.
            // Avoids having to maintain state/undo/redo functionality.
            for (Command command : listOfCommands) {
                CommandResult commandResult = command.execute(model);
                logger.info("Result of batch command: " + commandResult.getFeedbackToUser());
            }

            return new CommandResult(SUCCESS_MESSAGE, false, false, false, false);
        } catch (CommandException e) {
            throw new CommandException(String.format(ERROR_MESSAGE, e.getLocalizedMessage()));
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (other instanceof BatchCommand) {
            BatchCommand otherBatchCommand = (BatchCommand) other;

            boolean areListsSame = true;
            for (int i = 0; i < listOfCommands.size(); i++) {
                Command fromMainList = listOfCommands.get(i);
                Command fromOtherList = (Command) otherBatchCommand.listOfCommands.get(i);
                areListsSame &= fromMainList.equals(fromOtherList);
            }

            return areListsSame;
        }

        return false;
    }

}
