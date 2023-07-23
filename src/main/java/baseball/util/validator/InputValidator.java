package baseball.util.validator;

import baseball.constant.GameConstants;

import static baseball.constant.GameConstants.*;

public class InputValidator {

    public static void validate(String userInput) {
        if (!isLengthEqualsTo(userInput)) {
            exception();
        }

        if (!isAllNumbers(userInput)) {
            exception();
        }
    }

    private static void exception() {
        throw new IllegalArgumentException(String.format("입력은 %d자리의 숫자로 이루어져야 합니다.", BASEBALL_NUMBER_COUNT));
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
