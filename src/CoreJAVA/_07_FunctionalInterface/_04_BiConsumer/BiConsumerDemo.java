package _07_FunctionalInterface._04_BiConsumer;


import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer>addFunction=(a,b)-> System.out.println("Addition: "+(a + b));
        addFunction.accept(10,30);
        BiConsumer<Integer,Integer>subtract=(a,b)-> System.out.println("Subtraction: "+(a - b));
        subtract.accept(40,30);
        // this combinedFunction going to print first addFuncition and then subtract ;
        BiConsumer<Integer,Integer>combinedFunction=addFunction.andThen(subtract);
        combinedFunction.accept(60,40);
    }
}
