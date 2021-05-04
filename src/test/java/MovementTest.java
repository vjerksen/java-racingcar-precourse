import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovementTest {

    private Movement movement;
    private static final int MIN_NUM = 4;

    @BeforeEach
    void setUp() {
        movement = new Movement();
    }

    @DisplayName(value = "4 이상 확인")
    @Test
    void isOverFourTest() {
        assertThat(movement.isOverFour(MIN_NUM + 1)).isTrue();
        assertThat(movement.isOverFour(MIN_NUM)).isTrue();
        assertThat(movement.isOverFour(MIN_NUM - 1)).isFalse();
    }

    @DisplayName(value = "자동차 움직임 여부 확인")
    @Test
    void goOrStopTest() {
        assertThat(movement.goOrStop(MIN_NUM + 1)).isTrue();
        assertThat(movement.goOrStop(MIN_NUM)).isTrue();
        assertThat(movement.goOrStop(MIN_NUM - 1)).isFalse();
    }
}
