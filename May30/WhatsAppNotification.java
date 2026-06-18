package May30;

public class WhatsAppNotification extends Notification{
    public WhatsAppNotification(String message) {
        super(message);
    }

    @Override
    void send() {
     //   System.out.println(message);

    }
}
