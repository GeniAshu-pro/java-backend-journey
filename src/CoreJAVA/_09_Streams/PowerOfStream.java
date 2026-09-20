package _09_Streams;

import java.util.Arrays;
import java.util.List;

public class PowerOfStream {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);

//        Iteration 1: By using Stream
        List<Integer>evenNumber=numbers.stream().filter((num)->num%2==0).toList();
        System.out.println("Here is ur List of even Numbers: "+evenNumber);
    }
}
