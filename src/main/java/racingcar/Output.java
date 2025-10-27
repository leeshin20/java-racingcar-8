package racingcar;

import java.util.ArrayList;

public class Output {
    public static void promptCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void promptAttemptCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void displayResult() {
        System.out.println("\n실행 결과");
    }

    public static void displayProgress(ArrayList<Car> cars) {
        for (Car car : cars) {
            displayAttempt(car);
        }
        System.out.print("\n");
    }

    public static void displayAttempt(Car car) {
        System.out.printf("%s : ",car.getName());
        for(int i=0; i<car.getRaceScore(); i++){
            System.out.print("-");
        }
        System.out.print("\n");
    }

    public static void displayWinner(ArrayList<String> names) {
        Integer winnerCount = 1;
        System.out.print("최종 우승자 : ");
        for (String name : names) {
            if (winnerCount > 1) {
                System.out.print(", ");
            }
            winnerCount += 1;
            System.out.print(name);
        }
    }
}
