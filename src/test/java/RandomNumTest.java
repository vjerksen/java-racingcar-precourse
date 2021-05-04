import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumTest {

    RandomNum randomNum;

    @BeforeEach
    void setUp() {
        randomNum = new RandomNum();
    }

    @DisplayName(value = "랜덤 값 유효성 체크")
    @Test
    void checkRandomNumTest() {
        assertThat(randomNum.checkRandomNum(1)).isTrue();
    }

    @DisplayName(value = "랜덤 값 생성 확인")
    @Test
    void makeRandomNumTest() {
        assertThat(randomNum.makeRandomNum()).isLessThan(10);
        assertThat(randomNum.makeRandomNum()).isGreaterThan(-1);
    }
}
