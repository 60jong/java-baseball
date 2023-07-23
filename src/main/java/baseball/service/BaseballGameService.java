package baseball.service;

import baseball.domain.BaseballNumbers;
import baseball.util.RandomNumberListGenerator;
import java.util.List;

import static baseball.constant.GameConstants.*;

public class BaseballGameService {

    private BaseballNumbers targetBaseballNumbers;

    private BaseballNumbers makeBaseballNumbers(List<Integer> numbers) throws IllegalArgumentException {

        BaseballNumbers baseballNumbers = new BaseballNumbers();
        for (int number : numbers) {
            baseballNumbers.addNumber(number);
        }
        return baseballNumbers;
    }

    public void setTargetBaseballNumbers(int numberCount) {
        targetBaseballNumbers = makeBaseballNumbers(
                RandomNumberListGenerator.createUniqueRandomNumberList(numberCount, BASEBALL_NUMBER_START_NUMBER, BASEBALL_NUMBER_END_NUMBER)
        );
    }

    public BaseballNumbers makeUserBaseballNumbers(List<Integer> userInputNumbers) throws IllegalArgumentException {
        return makeBaseballNumbers(userInputNumbers);
    }
}


