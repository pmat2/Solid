package di;

public class SmsNotification implements NotificationSender {
    @Override
    public void sendNotification(User user) {
        System.out.println("Sending notification via sms to: " + user.getUsername());
    }
}
