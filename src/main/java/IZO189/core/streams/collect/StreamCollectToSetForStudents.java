package IZO189.core.streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamCollectToSetForStudents {

    public static void main(String[] args) {

        // 1. list of students
        List<Student> students = Arrays.asList(
                new Student(1, "Viraj", 17),
                new Student(2, "Krishnanand", 21),
                new Student(3, "Rishi", 16),
                new Student(4, "Suresh", 23),
                new Student(5, "Aditya", 19),
                new Student(5, "Aditya", 19) // duplicate
        );

        // 1.1 print all Students to console
        System.out.println("Original list of Students :-\n");
        students.stream().forEach(student -> System.out.println(student));

        // 2. get Students with Age less than 19 into new List
        Set<Student> ageLessThan19 = students
                .stream()
                .filter(student -> student.getAge() < 20)
                .collect(Collectors.toSet());

        // 2.1 print to console after collecting to new List
        System.out.println("\n\nStudents with Age less than 20 :-\n");
        ageLessThan19.stream().forEach(student -> System.out.println(student));
    }
}
