import java.lang.reflect.Array;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StringCalculator {
    public static int sum(String input) {
        if (input.isEmpty())
            return 0;
        else{
            Stream<String> numbers = stream(input.split(","));
            return numbers.mapToInt(Integer::parseInt).sum();
        }

    }
}
