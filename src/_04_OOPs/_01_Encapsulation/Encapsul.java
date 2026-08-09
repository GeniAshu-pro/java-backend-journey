package Encapsulation;

public class Encapsul {
    public static void main(String[] args) {
        Boots shoes = new Boots("Nike",2000);
        System.out.println("Show me price  "+shoes.getPrice());
        shoes.setPrice(3000.0);
        System.out.println("Show me the Updated price  "+shoes.getPrice());



    }
}
