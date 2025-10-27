package racingcar;

public class Car {
    private final String name;
    private int raceScore;
    private static final Integer FORWARD_CONSTANT = 4;

    public Car(String name) {
        this.name = name;
        raceScore = 0;
    }

    public String getName() {
        return name;
    }
}
