package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class StringConverter {

    public static List<Integer> toIntegerList(String input) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            result.add(Integer.parseInt(input.substring(i, i + 1)));
        }
        return result;
    }
}
