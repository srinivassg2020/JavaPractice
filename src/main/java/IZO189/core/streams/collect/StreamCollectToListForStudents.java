package IZO189.core.streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamCollectToListForStudents {

    public static void main(String[] args) {

        // 1. list of students
        List<Student> students = Arrays.asList(
                new Student(1, "Viraj", 17),
                new Student(2, "Krishnanand", 18),
                new Student(3, "Rishi", 16),
                new Student(4, "Suresh", 23),
                new Student(5, "Aditya", 21)
        );

        // 1.1 print all Students to console
        System.out.println("Original list of Students :-\n");
        students.stream().forEach(student -> System.out.println(student));

        // 2. get Students with Age less than 19 into new List
        List<Student> ageLessThan19 = students
                .stream()
                .filter(student -> student.getAge() < 19)
                .collect(Collectors.toList());

        // 2.1 print to console after collecting to new List
        System.out.println("\n\nStudents with Age less than 19 :-\n");
        ageLessThan19.stream().forEach(student -> System.out.println(student));
    }
}