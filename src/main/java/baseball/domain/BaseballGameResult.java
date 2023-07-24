package baseball.domain;

import static baseball.constant.GameConstants.*;
import static baseball.constant.GameMessages.INPUT_EXCEPTION_MESSAGE;

public class BaseballGameResult {

    private int balls;
    private int strikes;

    // Constructor
    public BaseballGameResult(int balls, int strikes) throws IllegalArgumentException {
        validate(balls, strikes);
        this.balls = balls;
        this.strikes = strikes;
    }

    private void validate(int balls, int strikes) throws IllegalArgumentException {
        if (balls > BASEBALL_NUMBER_COUNT || balls < 0) {
            exception();
        }

        if (strikes > BASEBALL_NUMBER_COUNT || strikes < 0) {
            exception();
        }

        if (balls + strikes > BASEBALL_NUMBER_COUNT) {
            exception();
        }
    }

    private static void exception() {
        throw new IllegalArgumentException(INPUT_EXCEPTION_MESSAGE);
    }

    // Method
    public String getResult() {
        StringBuilder sb = new StringBuilder();

        if (balls > 0) {
            sb.append(String.format("%d볼", balls));
            sb.append(" ");
        }

        if (strikes > 0) {
            sb.append(String.format("%d스트라이크", strikes));
        }

        if (sb.length() == 0) {
            sb.append("낫싱");
        }

        return sb.toString().trim();
    }
}
