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
        return new ArrayList<>(Arrays.asList(names.split(",")));
    }
}
