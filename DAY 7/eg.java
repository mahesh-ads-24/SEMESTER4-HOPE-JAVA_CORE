
/*

This demonstrates inheritance because child classes reuse parent properties.
It demonstrates runtime polymorphism because method overriding allows different behavior through a parent reference.

Reference type controls what you can access
Object type controls what actually runs

*/
class Notification {
    String name;
    String message;
    Notification(String name, String message) {
        this.name = name;
        this.message = message;
    }
    void send() {
        System.out.println("Generic notification");
    }
}

class EmailNotification extends Notification {
    EmailNotification(String name, String message) {
        super(name, message);
    }
    @Override
    void send() {
        System.out.println("Sending EMAIL to: " + name);
        System.out.println("Message: " + message);
    }
    void changeReceiverEmail() {
        System.out.println("Changing email...");
    }
}

class SMSNotification extends Notification {
    SMSNotification(String name, String message) {
        super(name, message);
    }
    @Override
    void send() {
        System.out.println("Sending SMS to: " + name);
        System.out.println("Message: " + message);
    }
}
public class eg {
    public static void main(String[] args) {
        Notification[] noti = {
            new EmailNotification("Garcia", "Email to user"),
            new SMSNotification("Garcia", "SMS to user")
        };
        for (Notification n : noti) {
            n.send();  // Runtime polymorphism happening here
        }
    }
}