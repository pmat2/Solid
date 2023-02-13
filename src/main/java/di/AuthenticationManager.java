package di;

public class AuthenticationManager {

    public void twoFactorAuthentication(User user, String email, String password){
        if(email.equals(user.getEmail()) && password.equals(user.getPassword())){
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.sendNotification(user);
            // authenticate
        }
    }
}
