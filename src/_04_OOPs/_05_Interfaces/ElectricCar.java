package _04_OOPs._05_Interfaces;

public class ElectricCar implements CarControls {
    @Override
    public void turnRight() {
        System.out.println("ELECTRIC RIGHT ");
    }

    @Override
    public void turnLeft() {
        System.out.println("ELECTRIC LEFT ");
    }

    @Override
    public void applyBrakes() {
        System.out.println("ELECTRIC BREAKS");
    }
}
