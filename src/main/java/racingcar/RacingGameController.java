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
        for (int i = 0; i < numberOfAttempts; i++) {
            tryOneAttempt(cars);
            Output.displayProgress(cars);
        }
        ArrayList<String> winners = findWinner(cars);
        Output.displayWinner(winners);
    }

    public static void tryOneAttempt(ArrayList<Car> cars) {
        for (Car car : cars) {
            car.tryMoveForward(pickNumber());
        }
    }

    public static Integer pickNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public static ArrayList<String> findWinner(ArrayList<Car> cars) {
        ArrayList<String> winners = new ArrayList<>();
        Integer highScore = findHighScore(cars);
        for (Car car : cars) {
            if (car.getRaceScore().equals(highScore)) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    public static Integer findHighScore(ArrayList<Car> cars) {
        Integer highScore = 0;
        for (Car car : cars) {
            Integer score = car.getRaceScore();
            if (score > highScore) {
                highScore = score;
            }
        }
        return highScore;
    }
}
