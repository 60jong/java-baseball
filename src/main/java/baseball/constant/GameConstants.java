package baseball.constant;

import java.util.List;

public class GameConstants {

    public static final int BASEBALL_NUMBER_START_NUMBER = 1;
    public static final int BASEBALL_NUMBER_END_NUMBER = 9;
    public static final int BASEBALL_NUMBER_COUNT = 3;

    // Exit Code
    public static final String GAME_EXIT_CODE_RESTART = "1";
    public static final String GAME_EXIT_CODE_EXIT = "2";

    public static List<String> getExitCodes() {
        return List.of(
                GAME_EXIT_CODE_RESTART,
                GAME_EXIT_CODE_EXIT
        );
    }
}
