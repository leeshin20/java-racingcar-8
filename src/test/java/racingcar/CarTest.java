package racingcar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 자동차_전진_테스트() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        cars.add(new Car("test2"));
        Car firstCar = cars.get(0);
        Car SecondCar = cars.get(1);
        firstCar.tryMoveForward(9);
        SecondCar.tryMoveForward(1);
        assertThat(firstCar.getRaceScore()).isEqualTo(1);
        assertThat(SecondCar.getRaceScore()).isEqualTo(0);
    }
}
