package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberListGenerator {

    public static List<Integer> createUniqueRandomNumberList(int size, int startInclusive, int endInclusive) {
        List<Integer> result = new ArrayList<>();

        while (result.size() < size) {
            int number = Randoms.pickNumberInRange(startInclusive, endInclusive);

            if (!result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
