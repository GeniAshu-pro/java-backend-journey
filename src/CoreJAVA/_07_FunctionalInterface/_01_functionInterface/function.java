package _07_FunctionalInterface._01_functionInterface;

import java.util.function.Function;

public class function {
    public static Function<Integer , Integer>addFunction = (a)->a+1;
    public static Function<Integer , Integer>subFunction = (a)->a-1;
    public static Function<Integer , Integer>combinedFunction = addFunction .andThen(subFunction);


//    public static void main(String[] args) {
//        System.out.println(addFunction.apply(10));
//        System.out.println(subFunction.apply(10));
//        System.out.println(combinedFunction.apply(10));
//    }
}
