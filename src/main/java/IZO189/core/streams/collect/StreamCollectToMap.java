package IZO189.core.streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectToMap {

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

        // 1.1 collect to map along with length
        Map<String, Integer> mapStringLenth = names
                .stream()
                .collect(Collectors
                        .toMap(Function.identity(), String::length));

        // 1.2 print to console
        System.out.println("\nMap :- " + mapStringLenth);
    }
}