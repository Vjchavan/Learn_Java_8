package FunctionalProgramming.FunctionaIInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class FI_Operators {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);


        BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };


        Integer reduce = numbers.stream()
                .reduce(0, sum);

        System.out.println(reduce);
    }

}
