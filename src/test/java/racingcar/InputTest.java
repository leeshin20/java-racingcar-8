package racingcar;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputTest {
    @Test
    void 자동차_이름_분할_테스트() {
        String names = "pobi,jun";
        ArrayList<String> result = Input.splitName(names);
        assertThat(result).contains("pobi", "jun");
        assertThat(result).containsExactly("pobi", "jun");
    }

    @Test
    void 자동차_이름_예외_처리_테스트() {
        String input = "abc123,abc,aabb";
        assertThatThrownBy(() -> Input.splitName(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5글자까지 입력 가능합니다.");
    }

    @Test
    void 시도할_회수_예외_처리_테스트() {
        String number = "aab";
        assertThatThrownBy(() -> Input.checkNumber(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1 이상의 올바른 수를 입력해주세요.");
    }
}
