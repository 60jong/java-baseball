package baseball.domain;

import baseball.constant.GameConstants;

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
}
