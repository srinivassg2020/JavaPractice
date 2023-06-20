package IZO189.core.ParallelStream;

/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 12:  Parallel Stream
Topic:  Develop the code that uses parallel stream
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamCreation {
    public static void main(String[] args) {
        // Create a list of integers, multiples of 1 to 20
        List<Integer> integerList = Stream.iterate(
                        1, (t) -> t <= 20, (t) -> t + 1)
                .collect(Collectors.toList());

        System.out.println("-----  Serial stream results -----");
        // Create stream from integerList
        for (int i = 0; i < 5; i++) {
            integerList.stream()
                    .forEach((s) -> System.out.print(s + " "));
            System.out.println();
        }

        System.out.println("----- Apply parallel operator to stream -----");
        // Turn a stream to a parallel stream by using parallel intermediate
        // operation on the stream.
        for (int i = 0; i < 5; i++) {
            integerList.stream()
                    .parallel()
                    .forEach((s) -> System.out.print(s + " "));
            System.out.println();
        }

        System.out.println("----- Getting a parallel stream from List -----");
        // Create parallel stream from integerList using parallelStream() method
        for (int i = 0; i < 5; i++) {
            integerList.parallelStream()
                    .forEach((s) -> System.out.print(s + " "));
            System.out.println();

        }

        System.out.println("----- Using stateful lambda expression -----");
        //  Create parallel stream from integerList using parallelStream() method
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            synchList.clear();
            integerList
                    .parallelStream()
                    // stateful lambda expression
                    .forEach((s) -> {
                        synchList.add(0, s);
                    });
            System.out.println(synchList);

        }
    }
}
