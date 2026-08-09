package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Iphone I1 = new Iphone("128GB    ", "6GB ", "3");
        I1.displayInfo();
        Samsung S1 = new Samsung("128GB   ", "6GB", "120hz");
        S1.displayInfo();
        S1.setStorage("124GB");
        System.out.println("Updated Storage : "+S1.getStorage());


    }
}
