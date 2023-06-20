package IZO189.core.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstMethodForIntegers {

    public static void main(String[] args) {

        // list of integer numbers
        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        // 1. Sequential - findFirst() from list of integers
        Optional<Integer> result1 = numbers // data-source
                .stream() // get sequential stream
                .findFirst(); // find first

        // 1.1 print Sequential result
        if(result1.isPresent()) {

            Integer firstNum = result1.get();
            System.out.println("1. Sequential findFirst() result is = "
                    + firstNum);
        }
        else {
            System.out.println("No value is pressnt");
        }

        // 2. Parallel - findFirst() from list of integers
        numbers //  data-source
                .parallelStream() // get parallel stream
                .findFirst() // find first
                .ifPresent(num ->
                        System.out.println("\n2. Parallel findFirst() result is = "
                                + num)); // print

        // 3. filtering and findFirst()
        Optional<Integer> result3 = numbers // data-source
                .stream() // get sequential stream
                .filter(num -> num % 2 == 0) // filter Even numbers
                .findFirst(); // find first

        // 3.1 print to console
        result3.ifPresent(num ->
                System.out.println("\n3. filter Even numbers & findFirst() result is = "
                        + num));

        // list of Strings
        List<String> names = Arrays.asList(
                "Putin",
                "Biden",
                "Manmohan",
                "Modi",
                "Jack"
        );

        // 1. Sequential - findFirst() from list of Strings
        Optional<String> result5 = names // data-source
                .stream() // get sequential stream
                .findFirst(); // find first

        // 1.1 print to console
        result5.ifPresent(str -> System.out.println(
                "1. Sequential findFirst() String result is = "
                        + str));

        // 2. Parallel - findFirst() from list of Strings
        Optional<String> result6 = names // data-source
                .parallelStream() // get parallel stream
                .findFirst(); // find first

        // 2.1 print to console
        result6.ifPresent(str -> System.out.println(
                "\n2. Parallel findFirst() String result is = "
                        + str));

        // 3. filtering and findFirst()
        Optional<String> result7 = names // data-source
                .stream() // get sequential stream
                .filter(str -> str.startsWith("M")) // filter
                .findFirst(); // find first

        // 3.1 print to console
        result7.ifPresent(str -> System.out.println(
                "\n3. filter name starting with 'M' & findFirst() result is = "
                        + str));

        // 4. empty Optional and findFirst()
        Optional<String> result8 = names // data-source
                .stream() // get sequential stream
                .filter(str -> str.startsWith("A")) // filter
                .findFirst(); // find first

        // 4.1 print to console
        System.out.println("\n4. names starting with 'A' = " + result8);
    }
}