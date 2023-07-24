package baseball.view.output;

import baseball.constant.GameMessages;
import baseball.domain.BaseballGameResult;

import static baseball.constant.GameMessages.*;

public class OutputView {

    public static void printResult(BaseballGameResult result) {
        System.out.println(result.getResult());
    }

    public static void printGameEndMessage() {
        System.out.println(GAME_END_MESSAGE);
    }


}
