package IZO189.core.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindAnyMethodForString {

    public static void main(String[] args) {

        // list of Strings
        List<String> names = Arrays.asList(
                "Putin",
                "Biden",
                "Manmohan",
                "Modi",
                "Jack"
        );

        // 1. Sequential - findAny() from list of Strings
        Optional<String> result1 = names // data-source
                .stream() // get sequential stream
                .findAny(); // find any element

        // 1.1 print to console
        result1.ifPresent(str -> System.out.println(
                "1. Sequential findAny() String result is = "
                        + str));

        // 2. Parallel - findAny() from list of Strings
        Optional<String> result2 = names // data-source
                .parallelStream() // get parallel stream
                .findAny(); // find any element

        // 2.1 print to console
        result2.ifPresent(str -> System.out.println(
                "\n2. Parallel findAny() String result is = "
                        + str));

        // 3. filtering and findFirst()
        Optional<String> result3 = names // data-source
                .stream() // get sequential stream
                .filter(str -> str.startsWith("M")) // filter
                .findAny(); // find any element

        // 3.1 print to console
        result3.ifPresent(str -> System.out.println(
                "\n3. filter name starting with 'M' & findAny() result is = "
                        + str));

        // 4. empty Optional and findAny()
        Optional<String> result4 = names // data-source
                .stream() // get sequential stream
                .filter(str -> str.startsWith("A")) // filter
                .findAny(); // find any element

        // 4.1 print to console
        System.out.println("\n4. names starting with 'A' = " + result4);

        // list of integer numbers
        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        // 1. Sequential - findAny() from list of integers
        Optional<Integer> result7 = numbers // data-source
                .stream() // get sequential stream
                .findAny(); // find any element

        // 1.1 print Sequential result
        if(result7.isPresent()) {

            Integer firstNum = result7.get();
            System.out.println("1. Sequential findAny() result is = "
                    + firstNum);
        }
        else {
            System.out.println("No value is pressnt");
        }

        // 2. Parallel - findAny() from list of integers
        numbers //  data-source
                .parallelStream() // get parallel stream
                .findAny() // find any element
                .ifPresent(num ->
                        System.out.println("\n2. Parallel findAny() result is = "
                                + num)); // print

        // 3. filtering and findFirst()
        Optional<Integer> result8 = numbers // data-source
                .stream() // get sequential stream
                .filter(num -> num % 2 == 0) // filter Even numbers
                .findAny(); // find any element

        // 3.1 print to console
        result8.ifPresent(num ->
                System.out.println("\n3. filter Even numbers & findAny() result is = "
                        + num));
    }
}
