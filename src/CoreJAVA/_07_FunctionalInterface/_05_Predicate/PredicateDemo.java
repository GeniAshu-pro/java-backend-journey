package _07_FunctionalInterface._05_Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer>isEven=(n)->n%2==0;
        System.out.println("is the Given Number is Even: "+isEven.test(10));
    }
}
