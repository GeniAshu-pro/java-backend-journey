package _07_FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        DiscountRule regularCustomer =
                price -> price;
        DiscountRule premiumCustomer=
                price->price*0.90;
        DiscountRule festivalSale =
                price->price*0.80;

        System.out.println(regularCustomer.apply(1000));
        System.out.println(premiumCustomer.apply(1000));
        System.out.println(festivalSale.apply(1000));

    }
}
