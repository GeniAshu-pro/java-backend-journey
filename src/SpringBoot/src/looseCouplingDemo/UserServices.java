package looseCouplingDemo;

public class UserServices {
    NotificationServices notificationServices;

    public UserServices(NotificationServices notificationServices) {
        this.notificationServices = notificationServices;
    }

   public void notifyUser(String message){
        notificationServices.send("Hello");
    }
}
