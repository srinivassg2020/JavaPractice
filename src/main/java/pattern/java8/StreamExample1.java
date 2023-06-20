package pattern.java8;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;
import static java.nio.file.Paths.*;
import static java.util.stream.Collectors.toMap;

public class StreamExample1 {
    public static void main(String[] args) throws IOException {
        String[] first = {"A", "B", "C"};
        String[] second = {"Apple","Boy","Dog"};

        Map<String, String> map = new HashMap<>();
        Arrays.stream(second).forEach(x -> {
            for (String y : first) {
                if (x.startsWith(y)) map.put(x, y);
            }
        });
        System.out.println(map);
        Map<String, String> collect = new HashMap<>();


        System.out.println(collect);
    /*    Arrays.stream(second)
                .filter(x->x.startsWith(String.valueOf(Arrays.stream(first).filter(y-> Boolean.parseBoolean(y.toString())))))
                //.sorted()
                //.findFirst()
                .forEach(System.out::println  );


        // 6. average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);


        // 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        // 8. Stream rows from text file, sort, filter, and print
        try (Stream<String> bands = lines(Paths.get("src/main/resources/bands.txt"))) {
            bands
                    .sorted()
                    .filter(x -> x.length() > 13)
                    .forEach(System.out::println);
            bands.close();
        }

        // 9. Stream rows from text file and save to List
        List<String> bands2 = Files.lines(Paths.get("src/main/resources/bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));

        // 10. Stream rows from CSV file and count
        Stream<String> rows1 = Files.lines(Paths.get("src/main/resources/data.txt"));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();

        // 11. Stream rows from CSV file, parse data from rows
        Stream<String> rows2 = Files.lines(Paths.get("src/main/resources/data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
        rows2.close();

        // 12. Stream rows from CSV file, store fields in HashMap
        Stream<String> rows3 = Files.lines(Paths.get("src/main/resources/data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();
        for (String key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }*/


    }
}
