package _07_FunctionalInterface;

public class Operation {
    @FunctionalInterface
    interface Addition {
        int add(int a , int b);
    }

    public static void main(String[] args) {
        Addition operation1 =(int a , int b)  -> {
            return a+b;
        };
        System.out.println(operation1.add(10,30));
    }
}
