package _07_FunctionalInterface;

public class FunctionalInterfaceDemo {
    @FunctionalInterface
    interface  BookAction {
        void perform();
    }

    public static void main(String[] args) {
        BookAction action1 =() -> System.out.println("Action1");
        BookAction action2 =() -> System.out.println("Action2");
        BookAction action3 =() -> System.out.println("Action3");
        BookAction action4 =() -> System.out.println("Action4");
        action1.perform();
        action2.perform();
        action3.perform();
        action4.perform();
    }
}
