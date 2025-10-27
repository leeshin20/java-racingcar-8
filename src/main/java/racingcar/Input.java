package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;

public class Input {
    public static ArrayList<String> inputCarName() {
        String names = Console.readLine();
        return splitName(names);
    }

    public static ArrayList<String> splitName(String names) {

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names.split(",")));
        checkName(nameList);
        return nameList;

    }

    public static void checkName(ArrayList<String> nameList) {
        for (String name : nameList) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5글자까지 입력 가능합니다.");
            }
        }
    }
}
