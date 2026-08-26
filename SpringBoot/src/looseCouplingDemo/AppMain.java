package looseCouplingDemo;

public class AppMain {
    static void main() {
NotificationServices emailNotificationService = new EmailNotificationService();
UserServices userService = new UserServices(emailNotificationService);

userService.notifyUser("Order placed !!");
    }
}
