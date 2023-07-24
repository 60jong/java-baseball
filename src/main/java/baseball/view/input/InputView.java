package baseball.view.input;

import baseball.constant.GameMessages;

import static baseball.constant.GameMessages.*;

public class InputView {

    public static void printGameStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static void printBaseballNumbersAskingMessage() {
        System.out.print(ASKING_INPUT_MESSAGE);
    }

    public static void printAskingExitCodeMessage() {
        System.out.println(ASKING_EXIT_CODE_MESSAGE);
    }
}
