package baseball.util.validator;

import baseball.constant.GameConstants;

import java.util.List;

import static baseball.constant.GameConstants.*;
import static baseball.constant.GameMessages.*;

public class InputValidator {

    public static void validateExitCode(String exitCode) {
        if (!includedInExitCodes(exitCode)) {
            exception(INPUT_EXIT_CODE_EXCEPTION_MESSAGE);
        }
    }

    private static boolean includedInExitCodes(String exitCode) {
        return GameConstants.getExitCodes().contains(exitCode);
    }

    public static void validateNumbers(String userInput) {
        if (!isLengthEqualsTo(userInput)) {
            exception(INPUT_EXCEPTION_MESSAGE);
        }

        if (!isAllNumbers(userInput)) {
            exception(INPUT_EXCEPTION_MESSAGE);
        }
    }

    private static void exception(String message) {
        throw new IllegalArgumentException(message);
    }

    private static boolean isAllNumbers(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!(input.charAt(i) >= '1' && input.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    private static boolean isLengthEqualsTo(String input) {
        return input.length() == BASEBALL_NUMBER_COUNT;
    }


}
