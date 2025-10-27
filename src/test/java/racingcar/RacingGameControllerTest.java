package racingcar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameControllerTest {
    @Test
    void 자동차_등록_테스트() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        cars.add(new Car("test2"));
        Car firstCar = cars.get(0);
        Car SecondCar = cars.get(1);
        assertThat(firstCar.getName()).isEqualTo("test");
        assertThat(SecondCar.getName()).isEqualTo("test2");
    }
}
