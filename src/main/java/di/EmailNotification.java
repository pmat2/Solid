package di;

public class EmailNotification {

    public void sendNotification(User user){
        System.out.println("Notifying user: " + user.getUsername());
    }
}
