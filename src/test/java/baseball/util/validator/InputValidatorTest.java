package baseball.util.validator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    @DisplayName("입력의 길이가 숫자 길이보다 짧은 경우 IllegalArgumentException")
    void input_length_smaller_than_numberCount() {
        String input = "12";

        assertThatThrownBy(() -> InputValidator.validate(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("입력의 길이가 숫자 길이를 넘는 경우 IllegalArgumentException")
    void input_length_longer_than_numberCount() {
        String input = "1234";

        assertThatThrownBy(() -> InputValidator.validate(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("입력이 숫자로만 이루어지지 않은 경우 IllegalArgumentException")
    void input_is_not_all_numbers() {
        String input = "abcd";

        assertThatThrownBy(() -> InputValidator.validate(input)).isInstanceOf(IllegalArgumentException.class);
    }
}