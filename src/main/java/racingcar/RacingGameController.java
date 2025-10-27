package racingcar;

import java.util.ArrayList;

public class RacingGameController {
    private static final ArrayList<Car> cars = new ArrayList<>();
    private static Integer numberOfAttempts;

    public static void startRace() {
        entryCar();
        determineNumberOfAttempts();
    }

    public static void entryCar() {
        Output.promptCarNames();
        ArrayList<String> names = Input.inputCarName();
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public static void determineNumberOfAttempts() {
        numberOfAttempts = Input.inputNumberOfAttempts();
    }
}
