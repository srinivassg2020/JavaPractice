package IZO189.core.streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectToList {

    public static void main(String[] args) {

        // 1. integer numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println("Original numbers :- "
                + numbers);

        // 1.1 collect to new list after doubling
        List<Integer> doubledNumbers = numbers
                .stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

        // 1.2 print to console
        System.out.println("Doubled numbers  :- "
                + doubledNumbers);

        // 2. list of Strings
        List<String> names = Arrays.asList(
                "Viraj",
                "Suresh",
                "Krishnanand",
                "Aditya",
                "Rishi"
        );
        System.out.println("\nOriginal list of names :- "
                + names);

        // 2.1 collect to new list - names containing 'i'
        List<String> namesContainingI = names
                .stream()
                .filter(name -> name.contains("i"))
                .collect(Collectors.toList());

        // 2.2 print to console
        System.out.println("Names containing 'i'   :- "
                + namesContainingI);
    }
}
