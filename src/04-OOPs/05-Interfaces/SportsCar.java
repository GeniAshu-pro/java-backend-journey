package interfaces;

public class SportsCar implements CarControls {
    @Override
    public void turnRight() {
        System.out.println("SportsRight");
    }

    @Override
    public void turnLeft() {
        System.out.println("SportsLeft ");
    }

    @Override
    public void applyBrakes() {
        System.out.println("SportsBrakes");
    }
}
