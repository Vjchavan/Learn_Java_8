package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FP_Map {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Print the cubes of odd numbers");
        numbers.stream()
                .map(x->(int)Math.pow(x,3))
                .forEach(System.out::println);

        List<String> course = Arrays.asList("AWS","Spring","Spring Boot","API","Microservices","PCF","Azure","Docker","kubernetes");
        System.out.println("Print the number of characters in each course name");
        course.stream()
                .map(x->x.length())
                .forEach(System.out::println);

    }
}
