package di;

public class EmailNotification implements NotificationSender{

    public void sendNotification(User user){
        System.out.println("Sending notification via mail to: " + user.getUsername());
    }
}
