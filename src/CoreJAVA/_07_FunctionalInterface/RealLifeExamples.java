package _07_FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealLifeExamples {
    public static void main(String[] args) {
        // <title> cost$<price>
        BiFunction<String,Double,String>formatter=( title ,price) -> title+" costs $"+price;
        System.out.println(formatter.apply("Java Basics",999.9));
        System.out.println(formatter.apply(" Sherlock Holmes",1999.0));

        //isExpensive
        Predicate<Double>isExpensive =(price)->price>500;
        System.out.println("is the Given Product Product is Expensive: "+isExpensive.test(999.0));
    }
}
