package _07_FunctionalInterface;
@FunctionalInterface
interface DiscountRule {
    double apply(double price);
}
