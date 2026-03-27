
class Notification{
    void send(){
        System.out.println("notification from parent");
        System.out.println("sending noti to:"+name);
        System.out.println("noti:"+message);
    }
    String name;
    String message;
    Notification(String name, String message){
        this.name=name;
        this.message=message;
    }
}
class EmailNotification extends Notification{
    EmailNotification(String name, String message){
        super(name, message);
    }
    void send(){
        System.out.println("sending email to:"+name);
        System.out.println("message:"+message);
    }
    void changeReceiverEmail(){
        System.out.println("chnaging email");
    }
}
class SMSNotification extends Notification{
    SMSNotification(String name, String message){
        super(name, message);
    }
    void send(){
        System.out.println("sending sms to:"+name);
        System.out.println("message:"+message);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Notification n ;
        n=new EmailNotification("garcia","email to user");
        n.send();
        n= new SMSNotification("garcia","sms to user");
        n.send();
        n=new Notification("garcia","message to user");
        n.send();
        EmailNotification m=new EmailNotification(null, null);
        m.changeReceiverEmail();
    }
}