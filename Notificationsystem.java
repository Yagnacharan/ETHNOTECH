interface Notification {
    void sendMessages(String message);
}
    class MobileNotification implements Notification {
        public void sendMessages(String message){
            System.out.println("Sending mobile notification: "+message);
        }
    }

    class EmailNotification implements Notification {
        public void sendMessages(String message){
            System.out.println("Sending email notification: "+message);
        }
    }

    class InstaNotification implements Notification {
        public void sendMessages(String message){
            System.out.println("Sending Insta notification: "+message);
        }
    }

    class JobNotification implements Notification {
        public void sendMessages(String message){
            System.out.println("Sending Job notification: "+message);
        }
    }

    public class Notificationsystem {
        public static void main(String[] args) {
            MobileNotification md=new MobileNotification();
            EmailNotification ed=new EmailNotification();
            InstaNotification id=new InstaNotification();
            JobNotification jd=new JobNotification();
            md.sendMessages("you have a new message!...");
            ed.sendMessages("you have a new message!...");
            id.sendMessages("you have a new message!...");
            jd.sendMessages("you have a new message!...");
        }
    }