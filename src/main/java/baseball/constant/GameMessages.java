package baseball.constant;

import static baseball.constant.GameConstants.*;

public class GameMessages {

    // Common
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";

    public static final String ASKING_INPUT_MESSAGE = "숫자를 입력해주세요 : ";

    public static final String ASKING_EXIT_CODE_MESSAGE = String.format(
            "게임을 새로 시작하려면 %s, 종료하려면 %s를 입력하세요.",
            GAME_EXIT_CODE_RESTART,
            GAME_EXIT_CODE_EXIT
    );

    public static final String GAME_END_MESSAGE = String.format("%d개의 숫자를 모두 맞히셨습니다! 게임 종료", BASEBALL_NUMBER_COUNT);

    // Exception
    public static final String INPUT_EXCEPTION_MESSAGE = String.format("입력은 서로 다른 %d개의 숫자로 이루어져야 합니다.", BASEBALL_NUMBER_COUNT);

    public static final String INPUT_EXIT_CODE_EXCEPTION_MESSAGE = ASKING_EXIT_CODE_MESSAGE;
}
