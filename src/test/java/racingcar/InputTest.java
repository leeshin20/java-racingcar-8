package racingcar;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class InputTest {
    @Test
    void 자동차_이름_분할_테스트() {
        String names = "pobi,jun";
        ArrayList<String> result = Input.splitName(names);
        assertThat(result).contains("pobi","jun");
        assertThat(result).containsExactly("pobi","jun");
    }


}
