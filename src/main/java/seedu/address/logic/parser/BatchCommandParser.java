package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_INSURANCE_POLICY;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.BatchCommand;
import seedu.address.logic.commands.DeleteCommand;
import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Handles all parsing of {@code BatchCommand} as well as arguments for {@code EditCommand} or {@code DeleteCommand}.
 */
public class BatchCommandParser implements Parser<BatchCommand> {
    public static final String INVALID_BATCH_COMMAND = "Invalid batch operation!\nOnly edit and delete operations "
            + "are supported.";
    public static final String INVALID_EDIT_ARGUMENTS = "Invalid arguments for edit command!\nOnly "
            + "phone numbers, addresses, tags and insurance policies can be edited in batch.";

    /**
     * Parses input to prepare for a {@code BatchCommand}, and the {@code Commands} that will be executed by it.
     * First, parses and checks the validity of the {@code Command} that is to be executed in batch.
     * Then, parses and checks the validity of the indices and arguments (if applicable) to be passed to the
     * {@code Command} to be executed in bulk.
     *
     * @param args arguments of the {@BatchCommand} passed in by the user
     * @return a {@code BatchCommand} with the {@code List} of {@code Commands} to be executed in batch.
     * @throws ParseException if the user input for {@code BatchCommand} or the {@code Commands} does not conform to
     *      the expected format.
     */
    public BatchCommand parse(String args) throws ParseException {
        try {
            String[] splitCommandAndIndicesAndArgs = args.trim().split(" ", 2);
            String inputCommand = splitCommandAndIndicesAndArgs[0].trim();

            // Checks the validity of the Command that the user passed as input to the BatchCommand
            switch (inputCommand) {
            case EditCommand.COMMAND_WORD:
                /* falls through */
            case DeleteCommand.COMMAND_WORD:
                break;
            default:
                throw new ParseException(INVALID_BATCH_COMMAND);
            }

            // Tokenises and parses the user input
            String inputIndicesAndArgs = splitCommandAndIndicesAndArgs[1].trim();
            ArgumentMultimap argMultimap =
                    ArgumentTokenizer.tokenize(inputIndicesAndArgs, PREFIX_NAME, PREFIX_PHONE, PREFIX_EMAIL,
                            PREFIX_ADDRESS, PREFIX_TAG, PREFIX_INSURANCE_POLICY);

            List<Index> listOfIndices = parseAndPrepareIndices(argMultimap);

            assert inputCommand.equals(EditCommand.COMMAND_WORD) || inputCommand.equals(DeleteCommand.COMMAND_WORD);

            if (inputCommand.equals(EditCommand.COMMAND_WORD)) {
                return batchEdit(argMultimap, listOfIndices);
            } else {
                return batchDelete(listOfIndices);
            }

        } catch (ParseException e) {
            throw new ParseException(String.format(BatchCommand.ERROR_MESSAGE, e.getLocalizedMessage()));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, BatchCommand.MESSAGE_USAGE));
        }
    }

    private List<Index> parseAndPrepareIndices(ArgumentMultimap argMultimap) throws ParseException {
        String indices = argMultimap.getPreamble();
        List<Index> listOfIndices = ParserUtil.parseIndices(indices.trim());

        // Reverse sort the list so that upon deletion of clients, the same index can still be used since we deleted
        // from the back. No side effect for EditCommands.
        Collections.sort(listOfIndices);
        Collections.reverse(listOfIndices);
        return listOfIndices;
    }

    private BatchCommand<EditCommand> batchEdit(ArgumentMultimap argMultimap, List<Index> listOfIndices)
            throws ParseException {
        if (areOtherPrefixesEntered(argMultimap)) {
            throw new ParseException(INVALID_EDIT_ARGUMENTS);
        }

        // Joins the rest of the input by user to be passed to the EditCommands
        List<String> listOfPhoneNumbers = argMultimap.getAllValues(PREFIX_PHONE);
        List<String> listOfAddresses = argMultimap.getAllValues(PREFIX_ADDRESS);
        List<String> listOfTags = argMultimap.getAllValues(PREFIX_TAG);
        List<String> listOfInsurancePolicies = argMultimap.getAllValues(PREFIX_INSURANCE_POLICY);
        String inputCommandArgs = concatAllArguments(listOfPhoneNumbers, listOfAddresses, listOfTags,
                listOfInsurancePolicies);

        List<EditCommand> listOfEditCommands = createEditCommands(listOfIndices, inputCommandArgs);

        return new BatchCommand<>(listOfEditCommands);
    }

    private List<EditCommand> createEditCommands(List<Index> listOfIndices, String inputCommandArgs)
            throws ParseException {
        EditCommandParser editCommandParser = new EditCommandParser();
        List<EditCommand> listOfEditCommands = new ArrayList<>();

        for (Index index : listOfIndices) {
            String newCommandInput = index.getOneBased() + " " + inputCommandArgs;
            EditCommand editCommand = editCommandParser.parse(newCommandInput);
            listOfEditCommands.add(editCommand);
        }

        return listOfEditCommands;
    }

    private BatchCommand<DeleteCommand> batchDelete(List<Index> listOfIndices) throws ParseException {
        List<DeleteCommand> listOfDeleteCommands = createDeleteCommands(listOfIndices);
        return new BatchCommand<>(listOfDeleteCommands);
    }

    private List<DeleteCommand> createDeleteCommands(List<Index> listOfIndices) throws ParseException {
        DeleteCommandParser deleteCommandParser = new DeleteCommandParser();
        List<DeleteCommand> listOfDeleteCommands = new ArrayList<>();

        for (Index index : listOfIndices) {
            String indexString = String.valueOf(index.getOneBased());
            DeleteCommand deleteCommand = deleteCommandParser.parse(indexString);
            listOfDeleteCommands.add(deleteCommand);
        }

        return listOfDeleteCommands;
    }

    private String concatAllArguments(List<String> listOfPhoneNumbers, List<String> listOfAddresses,
                                      List<String> listOfTags, List<String> listOfInsurancePolicies) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < listOfPhoneNumbers.size(); i++) {
            stringBuilder
                    .append(PREFIX_PHONE.getPrefix())
                    .append(listOfPhoneNumbers.get(i))
                    .append(" ");
        }
        for (int i = 0; i < listOfAddresses.size(); i++) {
            stringBuilder
                    .append(PREFIX_ADDRESS.getPrefix())
                    .append(listOfAddresses.get(i))
                    .append(" ");
        }
        for (int i = 0; i < listOfTags.size(); i++) {
            stringBuilder
                    .append(PREFIX_TAG.getPrefix())
                    .append(listOfTags.get(i))
                    .append(" ");
        }
        for (int i = 0; i < listOfInsurancePolicies.size(); i++) {
            stringBuilder
                    .append(PREFIX_INSURANCE_POLICY.getPrefix())
                    .append(listOfInsurancePolicies.get(i))
                    .append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private boolean areOtherPrefixesEntered(ArgumentMultimap argMultimap) {
        return argMultimap.getValue(PREFIX_NAME).isPresent()
                || argMultimap.getValue(PREFIX_EMAIL).isPresent();
    }
}
