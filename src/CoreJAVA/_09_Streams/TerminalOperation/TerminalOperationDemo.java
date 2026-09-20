package _09_Streams.TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    public static void main(String[] args) {
// reduce()  : Stream ke value mein se ek final value produce krna hai
//                       then use reduce ().

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> integerStream = numbers.stream();
        int sum = integerStream.reduce(0, (acc, num) -> acc + num);
//    by using method references  u can do that
//        int sum =integerStream.reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        /*
        int sum =numbers.stream().reduce(0,Integer::sum);
        System.out.println("Sum: "+sum);
         */

//         Collect():Tumhe output ko kiss form mein collect krna hai
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: "+evenNumbers);


//        find & match

//        findFirst(): stream mein jho bhi first hai give me that by get we take that
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

//        match : agr tumhe stream ke value se kuch match krna hai tho yeh use hota hai
        boolean has40 = numbers.stream().anyMatch(n->n==40);
        System.out.println(has40);



//        iteration
        numbers.stream().forEach(System.out::println);





    }
}
