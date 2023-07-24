package baseball;

import baseball.controller.BaseballGameController;

public class Computer {

    public static void run() {
        BaseballGameController controller = new BaseballGameController();
        try {
            controller.startGame();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            System.out.println("게임을 종료합니다.");
            throw exception;
        }
    }
}
