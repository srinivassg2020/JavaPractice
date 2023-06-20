package IZO189.core.streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectToSet {

    public static void main(String[] args) {

        // 1. integer numbers
        List<Integer> numbers = Arrays.asList(
                1,2,3,4,5,
                1,2,3,4,5
        );
        System.out.println("Original numbers with duplicates :- "
                + numbers);

        // 1.1 collect to Set which ignores duplicates
        Set<Integer> uniqueNumbers = numbers
                .stream()
                .filter(num -> num <= 3)
                .collect(Collectors.toSet()); // removes duplicates

        // 1.2 print to console
        System.out.println("Unique numbers under 3 in Set  :- "
                + uniqueNumbers);

        // 2. list of Strings
        List<String> names = Arrays.asList(
                "Viraj",
                "Suresh",
                "Krishnanand",
                "Aditya",
                "Rishi",
                "Viraj",
                "Suresh"
        );
        System.out.println("\n\nOriginal list of names with duplicates :- \n"
                + names);

        // 2.1 collect to new Set ignoring duplicates names
        Set<String> uniqueNames = names
                .stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toSet()); // removes duplicates

        // 2.2 print to console
        System.out.println("\nUpper case unique names in Set :- \n"
                + uniqueNames);
    }
}
