package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP_ToCollect {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Create a list of even nums filtered from numbers list");
        List<Integer> evenNumebers = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumebers);

        List<String> course = Arrays.asList("AWS","Spring","Spring Boot","API","Microservices","PCF","Azure","Docker","kubernetes");
        System.out.println("Create a list of lengths of courses filtered from courses list");
        List<Integer> lengthOfCourses = course.stream()
                .map(x -> x.length())
                .collect(Collectors.toList());
        System.out.println(lengthOfCourses);
    }
}
