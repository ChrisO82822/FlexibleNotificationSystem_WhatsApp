/**
 * Sends notification messages through an SMS service.
 * <p>
 * This class implements the NotificationMedium interface and provides
 * text-message-specific notification behavior.
 * </p>
 *
 * @author Christopher Oji
 * @version 1.0
 */
public class SMSService implements NotificationMedium {

    /**
     * Creates a new SMSService.
     */
    public SMSService() {
        // Default constructor.
    }

    /**
     * Sends the given message as an SMS notification.
     *
     * @param message the message that will be sent by SMS
     */
    @Override
    public void send(String message) {
        System.out.println("SMS notification sent: " + message);
    }
}
