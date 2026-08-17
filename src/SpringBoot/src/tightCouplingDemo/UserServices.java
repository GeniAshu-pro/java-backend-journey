package tightCouplingDemo;

public class UserServices {
    NotificationServices notificationServices = new NotificationServices();
    public void notifyUser(String message){
        notificationServices.send(message) ;
    }
}
