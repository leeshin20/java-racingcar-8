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

    @Test
    void 최고점수_판별_테스트() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        cars.add(new Car("test2"));
        Car firstCar = cars.get(0);
        Car SecondCar = cars.get(1);
        firstCar.tryMoveForward(9);
        Integer highScore = RacingGameController.findHighScore(cars);
        assertThat(highScore).isEqualTo(1);
        assertThat(firstCar.getRaceScore()).isEqualTo(highScore);
    }

    @Test
    void 우승자가_한명일_때_판정_테스트() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        cars.add(new Car("test2"));
        Car firstCar = cars.get(0);
        Car SecondCar = cars.get(1);
        firstCar.tryMoveForward(9);
        ArrayList<String> winners = RacingGameController.findWinner(cars);
        assertThat(winners).hasSize(1);
        assertThat(winners).contains("test");
    }

    @Test
    void 우승자가_여러명일_때_판정_테스트() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        cars.add(new Car("test2"));
        Car firstCar = cars.get(0);
        Car SecondCar = cars.get(1);
        firstCar.tryMoveForward(9);
        SecondCar.tryMoveForward(9);
        ArrayList<String> winners = RacingGameController.findWinner(cars);
        assertThat(winners).hasSize(2);
        assertThat(winners).contains("test", "test2");
    }
}
