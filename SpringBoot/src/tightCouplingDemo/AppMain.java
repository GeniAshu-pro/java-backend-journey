package tightCouplingDemo;

public class AppMain {
    public static void main(String[] args) {
        UserServices userServices = new UserServices();
userServices.notifyUser("Order Placed");
    }
}
