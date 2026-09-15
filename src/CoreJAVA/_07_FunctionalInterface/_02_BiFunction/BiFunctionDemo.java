package _07_FunctionalInterface._02_BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static BiFunction<Integer , Integer, Integer> addFunction =
            (a,b)->a+b;
            //     Integer::sum;    ------> by using Method References

    public static BiFunction<Integer ,Integer,Integer>subFunction=
            (a,b)->a-b;


    public static void main(String[] args) {
        System.out.println(addFunction.apply(10,19));
        System.out.println(subFunction.apply(10,19));
        Function<Integer,Integer>MultiplyBy2=x ->x*2;
        BiFunction<Integer,Integer,Integer>combinedFunction =
                addFunction.andThen(MultiplyBy2);
        System.out.println(combinedFunction.apply(1,4));
    }
}
