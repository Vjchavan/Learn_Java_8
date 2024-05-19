package FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FP_Reduce {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Square every number in a list and find the sum of squares");
        numbers.stream()
                .map(x->(int)Math.pow(x,2))
                .reduce(0,Integer::sum);

        System.out.println("Cube every number in a list and find the sum of Cubes");
        numbers.stream()
                .map(x->(int)Math.pow(x,3))
                .reduce(0,Integer::sum);

        System.out.println("find the sum of odd numbers in list");
        numbers.stream()
                .filter(x->x%2!=0)
                .reduce(0,Integer::sum);


        System.out.println("Cube every number in a list and find the sum of Cubes");
        numbers.stream()
                .map(x->(int)Math.pow(x,3))
                .sorted(Comparator.reverseOrder());


    }

}
