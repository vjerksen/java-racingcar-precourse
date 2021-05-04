import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNameTest {

    private CarName carName;
    private static final int MAX_LEN = 5;

    @BeforeEach
    void setUp() {
        carName = new CarName();
    }

    @DisplayName(value = "5 이하 확인")
    @Test
    void isUnderFiveTest() {
        assertThat(carName.isUnderFive(MAX_LEN)).isTrue();
        assertThat(carName.isUnderFive(MAX_LEN + 1)).isFalse();
    }

    @DisplayName(value = "5글자 이하 확인")
    @Test
    void isNameLengthUnderFiveTest() {
        assertThat(carName.isNameLengthUnderFive("asdfg")).isTrue();
        assertThat(carName.isNameLengthUnderFive("asfffg")).isFalse();
    }

    @DisplayName(value = "쉼표를 기준으로 자동차 이름을 나눈다")
    @Test
    void separateNameByCommaTest() {
        assertThat(carName.separateNameByComma("asdf,dddd,").contains("asdf")).isTrue();
        assertThat(carName.separateNameByComma("asdf,dddd,").contains("dddd")).isTrue();
        assertThat(carName.separateNameByComma("asdf,dddd,").contains("asd")).isFalse();
    }
}
