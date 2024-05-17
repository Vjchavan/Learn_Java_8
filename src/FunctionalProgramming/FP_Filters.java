package FunctionalProgramming;

import java.util.*;


public class FP_Filters {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Print all numbers");
        numbers.stream()
                .forEach(System.out::println);

        System.out.println("Print even numbers");
        numbers.stream()
                .filter(x-> x%2==0)
                .forEach(System.out::println);

        System.out.println("Print odd numbers");
        numbers.stream()
                .filter(x-> x%2!=0)
                .forEach(System.out::println);

        List<String> courses = Arrays.asList("AWS","Spring","Spring Boot","API","Microservices","PCF","Azure","Docker","kubernetes");

        System.out.println("Print all Courses\n");
        courses.stream()
                .forEach(System.out::println);

        System.out.println("Print courses containing the word 'Spring'");
        courses.stream()
                .filter(x->x.contains("Spring"))
                .forEach(System.out::println);

        System.out.println("Print courses with atleast 4 letters");
        courses.stream()
                .filter(x->x.length()>=4)
                .forEach(System.out::println);
    }
}
