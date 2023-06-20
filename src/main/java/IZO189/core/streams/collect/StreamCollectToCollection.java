package IZO189.core.streams.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectToCollection {

    public static void main(String[] args) {

        // 1. list of Strings
        List<String> names = Arrays.asList(
                "Viraj",
                "Suresh",
                "Krishnanand",
                "Aditya",
                "Rishi"
        );
        System.out.println("Original list of names :- "
                + names);

        // 1.1 collect to Ordered ArrayList with names containing 'i'
        ArrayList<String> orderedNamesContainingI = names
                .stream()
                .filter(name -> name.contains("i"))
                .collect(Collectors.toCollection(ArrayList::new));

        // 1.2 print to console
        System.out.println("\nOrdered names containing"
                + " 'i' in ArrayList :- " + orderedNamesContainingI);

        // 2.1 collect to Unordered HashSet with names containing 'i'
        HashSet<String> unOrderedNamesContainingI = names
                .stream()
                .filter(name -> name.contains("i"))
                .collect(Collectors.toCollection(HashSet::new));

        // 2.2 print to console
        System.out.println("\nUnordered names containing"
                + " 'i' in HashSet :- " + unOrderedNamesContainingI);
    }
}