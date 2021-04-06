package seedu.address.logic.parser;

import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.BatchCommand;
import seedu.address.logic.commands.CommandTestUtil;
import seedu.address.logic.commands.DeleteCommand;
import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class BatchCommandParserTest {

    private static final BatchCommandParser BATCH_COMMAND_PARSER = new BatchCommandParser();
    private static final EditCommandParser EDIT_COMMAND_PARSER = new EditCommandParser();
    private static final DeleteCommandParser DELETE_COMMAND_PARSER = new DeleteCommandParser();
    private static final List<Index> LIST_OF_INDICES = Arrays.asList(Index.fromOneBased(3), Index.fromOneBased(2),
            Index.fromOneBased(1));

    @Test
    public void parse_validArgsForBatchEdit_returnsBatchEditCommand() {
        try {
            List<EditCommand> listOfEditCommands = new ArrayList<>();
            for (Index index : LIST_OF_INDICES) {
                String newCommandInput = index.getOneBased() + " " + CommandTestUtil.ARGS_FOR_EDIT;
                EditCommand editCommand = EDIT_COMMAND_PARSER.parse(newCommandInput);
                listOfEditCommands.add(editCommand);
            }

            assertParseSuccess(BATCH_COMMAND_PARSER, "edit 1, 2,3 t/husband i/P#1245 i/POL#6789>www.youtube.com",
                    new BatchCommand<>(listOfEditCommands));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parse_validArgsForBatchDelete_returnsBatchDeleteCommand() {
        try {
            List<DeleteCommand> listOfDeleteCommands = new ArrayList<>();
            for (Index index : LIST_OF_INDICES) {
                String newCommandInput = String.valueOf(index.getOneBased());
                DeleteCommand deleteCommand = DELETE_COMMAND_PARSER.parse(newCommandInput);
                listOfDeleteCommands.add(deleteCommand);
            }

            assertParseSuccess(BATCH_COMMAND_PARSER, "delete 1, 2,3",
                    new BatchCommand<>(listOfDeleteCommands));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parse_invalidIndices_throwsParseException() {
        assertParseFailure(BATCH_COMMAND_PARSER, "delete 0, 1, 2",
                String.format(BatchCommand.ERROR_MESSAGE, ParserUtil.MESSAGE_INVALID_INDEX));

        assertParseFailure(BATCH_COMMAND_PARSER, "edit 0, 4, 5 t/husband i/P#1245 i/POL#6789>www.youtube.com",
                String.format(BatchCommand.ERROR_MESSAGE, ParserUtil.MESSAGE_INVALID_INDEX));
    }

    @Test
    public void parse_invalidEditArguments_throwsParseException() {
        assertParseFailure(BATCH_COMMAND_PARSER, "edit 1, 4, 5 n/Tom i/P#1245 i/POL#6789>www.youtube.com",
                String.format(BatchCommand.ERROR_MESSAGE, BatchCommandParser.INVALID_EDIT_ARGUMENTS));
    }

    @Test
    public void parse_invalidCommandForBatch_throwsParseException() {
        assertParseFailure(BATCH_COMMAND_PARSER, "add n/Tom a/Orchard p/9999 e/tom@tom.com t/tom i/POL_#tom123",
                String.format(BatchCommand.ERROR_MESSAGE, BatchCommandParser.INVALID_BATCH_COMMAND));

        assertParseFailure(BATCH_COMMAND_PARSER, "policy 1",
                String.format(BatchCommand.ERROR_MESSAGE, BatchCommandParser.INVALID_BATCH_COMMAND));

        assertParseFailure(BATCH_COMMAND_PARSER, "exit",
                String.format(BatchCommand.ERROR_MESSAGE, BatchCommandParser.INVALID_BATCH_COMMAND));

        assertParseFailure(BATCH_COMMAND_PARSER, "list",
                String.format(BatchCommand.ERROR_MESSAGE, BatchCommandParser.INVALID_BATCH_COMMAND));

        assertParseFailure(BATCH_COMMAND_PARSER, "find",
                String.format(BatchCommand.ERROR_MESSAGE, BatchCommandParser.INVALID_BATCH_COMMAND));

        assertParseFailure(BATCH_COMMAND_PARSER, "sort -n -des",
                String.format(BatchCommand.ERROR_MESSAGE, BatchCommandParser.INVALID_BATCH_COMMAND));

        assertParseFailure(BATCH_COMMAND_PARSER, "lock 123",
                String.format(BatchCommand.ERROR_MESSAGE, BatchCommandParser.INVALID_BATCH_COMMAND));
    }

}
