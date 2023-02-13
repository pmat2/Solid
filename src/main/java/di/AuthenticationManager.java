package di;

public class AuthenticationManager {

    private final NotificationSender notificationSender;

    public AuthenticationManager(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void twoFactorAuthentication(User user, String email, String password){
        if(email.equals(user.getEmail()) && password.equals(user.getPassword())){
            notificationSender.sendNotification(user);
            // authenticate
        }
    }
}
