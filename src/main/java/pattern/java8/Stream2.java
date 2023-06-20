package pattern.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static  void main(String[] args){
        // Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?

      /*  List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);
       // Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        myList.stream()
                .map(x->x+"")
                .filter(x->x.startsWith("1"))
                .forEach(System.out::println);*/

        //Q3 How to find duplicate elements in a given integers list in java using Stream functions?
        String s = "Q3 How to find duplicate elements in a given integers list in java using Stream functions?";
        System.out.println (s);
        List<Integer> duplicateList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        duplicateList.stream()
        .filter(x->!set.add(x))
                .forEach(System.out::println);
        //Q4 Given the list of integers, find the first element of the list using Stream functions?
        System.out.println ("Q4 Given the list of integers, find the first element of the list using Stream functions?");
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);

        // Q5 Given a list of integers, find the total number of elements present in the list using Stream functions?

        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count = myList1.stream()
                .count();
                System.out.println(count);
        //Q6 Given a list of integers, find the maximum value element present in it using Stream functions?

        List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer max = myList2.stream().max(Integer::compareTo).get();
        System.out.println(max);

        //Q7 Given a String, find the first non-repeated character in it using Stream functions?
        String input = "Java Hungry Blog Alive is Awesome";
        Character result = input.chars().
                mapToObj(s1 -> Character.toLowerCase(Character.valueOf((char) s1))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        //Q8 Given a String, find the first repeated character in it using Stream functions?
        String input1 = "Java Hungry Blog Alive is Awesome";
        Character character = input1.chars()
                .mapToObj(s3 -> Character.toLowerCase(Character.valueOf((char) s3)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(character);
        //Q9 Given a list of integers, sort all the values present in it using Stream functions?

        List<Integer> myList4 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Stream<Integer> sorted = myList4.stream().sorted(Collections.reverseOrder());
        sorted.forEach(System.out::println);

        //Q10 Given a list of integers, find out all the even numbers that exist in the list using Stream functions?Q10
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(x->x%2==0)
                .forEach(System.out::println);

        //Flatmap

        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> numbers = Stream.of(evens, odds, primes)
                .flatMap(listFlat -> listFlat.stream())
                .collect(Collectors.toList());
        System.out.println("flattend list: " + numbers);
    }
}
