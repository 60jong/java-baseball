package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class BaseballGameResultTest {

    @Test
    @DisplayName("0볼 0스트라이크인 경우 낫싱 반환")
    void balls_strikes_all_0() {
        // given
        int balls = 0;
        int strikes = 0;
        BaseballGameResult baseballGameResult = new BaseballGameResult(strikes, balls);

        // when
        String result = baseballGameResult.getResult();

        // then
        assertThat(result).isEqualTo("낫싱");
    }

    @Test
    @DisplayName("볼만 있을 경우")
    void only_balls() {
        // given

        // when

        // then

    }

}