import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StringCalculator {

    private String delimiter;
    private String numbers;

    public StringCalculator(String delimiter, String numbers) {
        this.delimiter = delimiter;
        this.numbers = numbers;
    }

    private int sum() {
        if (getNumber().anyMatch(n -> n < 0)) {
            throw new IllegalArgumentException();
        }
        return getNumber().sum();
    }
     private IntStream getNumber() {
        return Arrays.stream(numbers.split(delimiter))
                .mapToInt(Integer::parseInt);
     }


//        return Arrays.stream(numbers.split(delimiter))
//                .mapToInt(Integer::parseInt)
//                .sum();


    public static int sum(String input) {
        if (input.isEmpty())
            return 0;

        return parseInput(input).sum();
    }

    private static StringCalculator parseInput(String input) {
        if (input.startsWith("//")) {
            String [] parts = input.split("\n", 2);
            return new StringCalculator(parts[0].substring(2), parts[1]);
        } else {
            return new StringCalculator(",|\n", input);
        }
    }
}