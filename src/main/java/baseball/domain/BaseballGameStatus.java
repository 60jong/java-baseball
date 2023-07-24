package baseball.domain;

import static baseball.constant.GameConstants.*;

public class BaseballGameStatus {

    private BaseballGameResult resultHolder;

    public void recordGameResult(BaseballGameResult result) {
        this.resultHolder = result;
    }

    public boolean isGameEnded() {
        if (resultHolder == null) {
            return false;
        }

        return resultHolder.getResult()
                .equals(String.format("%d스트라이크", BASEBALL_NUMBER_COUNT));
    }
}
