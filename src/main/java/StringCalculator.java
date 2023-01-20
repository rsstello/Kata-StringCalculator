import java.lang.reflect.Array;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StringCalculator {
    public static int sum(String input) {
        if (input.isEmpty())
            return 0;

        String delimiter = ",|\n";
        if (input.startsWith("//")) {
            String[] parts = input.split("\n", 2);
            delimiter = parts[0].substring(2);
            input = parts[1];
        }
            Stream<String> numbers = stream(input.split(",|\n"));
            return numbers.mapToInt(Integer::parseInt).sum();
        }
    }