package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.GameConstants.*;

public class BaseballNumbers {

    private final List<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        if (numbers.contains(number)) {
            throw new IllegalArgumentException(String.format("입력은 서로 다른 %d자리 숫자로 이루어져야 합니다.", BASEBALL_NUMBER_COUNT));
        }
        numbers.add(number);
    }

    public BaseballGameResult compareWith(BaseballNumbers another) {
        return new BaseballGameResult(countBalls(another), countStrikes(another));
    }

    public int countBalls(BaseballNumbers another) {
        int balls = 0;
        for (int numberIndex = 0; numberIndex < numbers.size(); numberIndex++) {
            int number = this.numbers.get(numberIndex);
            if (another.hasNumberButNotMatchAt(number, numberIndex)) {
                balls++;
            }
        }
        return balls;
    }

    public int countStrikes(BaseballNumbers another) {
        int strikes = 0;
        for (int numberIndex = 0; numberIndex < numbers.size(); numberIndex++) {
            int number = numbers.get(numberIndex);

            if (another.matchNumberAt(number, numberIndex)) {
                strikes++;
            }
        }
        return strikes;
    }

    public boolean hasNumber(int number) {
        return this.numbers.contains(number);
    }

    public boolean hasNumberButNotMatchAt(int number, int numberIndex) {
        return this.hasNumber(number) && !this.matchNumberAt(number, numberIndex);
    }

    public boolean matchNumberAt(int number, int index) {
        return this.numbers.get(index) == number;
    }
}
