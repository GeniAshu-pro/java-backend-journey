package _07_FunctionalInterface._05_Predicate;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isSumEven=(a, b) -> (a + b) % 2 == 0;
        System.out.println("Is Sum of given Number is Even: "+isSumEven.test(10,12));
    }
}
