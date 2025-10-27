package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class RacingGameController {
    private static final ArrayList<Car> cars = new ArrayList<>();
    private static Integer numberOfAttempts;

    public static void startRace() {
        entryCar();
        determineNumberOfAttempts();
        runRace();
    }

    public static void entryCar() {
        Output.promptCarNames();
        ArrayList<String> names = Input.inputCarName();
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public static void determineNumberOfAttempts() {
        Output.promptAttemptCount();
        numberOfAttempts = Input.inputNumberOfAttempts();
    }

    public static void runRace() {
        Output.displayResult();
        for (int i = 1; i<numberOfAttempts; i++) {
            tryOneAttempt(cars);
        }
    }

    public static void tryOneAttempt(ArrayList<Car> cars) {
        for (Car car : cars) {
            car.tryMoveForward(pickNumber());
            Output.displayProgress(car);
        }
    }

    public static Integer pickNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
