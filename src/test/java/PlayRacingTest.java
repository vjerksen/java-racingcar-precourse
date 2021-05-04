import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PlayRacingTest {
    PlayRacing playRacing = new PlayRacing();

    @DisplayName(value = "최고 값인 지 확인 테스트")
    @Test
    void isMaxValueTest() {
        ArrayList<Integer> intArray = new ArrayList<>();
        int maxValue = 0;

        intArray.add(156);
        intArray.add(11);
        intArray.add(122);
        intArray.add(123);

        for (int value : intArray) {
            maxValue = playRacing.isMaxValue(value, maxValue);
        }

        assertThat(maxValue).isEqualTo(intArray.get(0));
    }

    @DisplayName(value = "결과 바 그려주는 테스트")
    @Test
    void printBarTest() {
        int index = 3;
        String str = "";

        for (int i = 0; i < index; i++) {
            str += "-";
        }

        assertThat(str).isEqualTo("---");
    }
}
