package lld1_april_2026.polymorphism;

public class NotificationService {
    public void sendWelcomeNotification(User user){
        String message = "Welcome,  "+user.getUsername() + " ! ";
        message += "\n Your Role : "+user.getRole();

        //send email
        //functionality to sent a email

        System.out.println("Email sent to : " + user.getEmail());
        System.out.println(message);
    }
}
