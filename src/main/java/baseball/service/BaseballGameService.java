package baseball.service;

import baseball.domain.BaseballGameStatus;
import baseball.domain.BaseballNumbers;
import baseball.domain.BaseballGameResult;
import baseball.util.RandomNumberListGenerator;
import java.util.List;
import static baseball.constant.GameConstants.*;

public class BaseballGameService {

    private final BaseballNumbers targetBaseballNumbers;
    private final BaseballGameStatus gameStatus;

    // Constructor
    public BaseballGameService() {
        this.targetBaseballNumbers = makeTargetBaseballNumbers(BASEBALL_NUMBER_COUNT);
        this.gameStatus = new BaseballGameStatus();
    }

    private BaseballNumbers makeTargetBaseballNumbers(int numberCount) {
        return makeBaseballNumbers(
                RandomNumberListGenerator.createUniqueRandomNumberList(
                        numberCount,
                        BASEBALL_NUMBER_START_NUMBER,
                        BASEBALL_NUMBER_END_NUMBER
                )
        );
    }

    private BaseballNumbers makeBaseballNumbers(List<Integer> numbers) throws IllegalArgumentException {

        BaseballNumbers baseballNumbers = new BaseballNumbers();
        for (int number : numbers) {
            baseballNumbers.addNumber(number);
        }
        return baseballNumbers;
    }

    public BaseballNumbers makeUserBaseballNumbers(List<Integer> userInputNumbers) throws IllegalArgumentException {
        return makeBaseballNumbers(userInputNumbers);
    }

    public BaseballGameResult makeBaseballResult(BaseballNumbers userBaseballNumbers) {
        BaseballGameResult gameResult = targetBaseballNumbers.compareWith(userBaseballNumbers);
        gameStatus.recordGameResult(gameResult);
        return gameResult;
    }

    public boolean isGameDone() {
        return gameStatus.isGameEnded();
    }
}


