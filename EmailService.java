/**
 * Sends notification messages through an email service.
 * <p>
 * This class implements the NotificationMedium interface and provides
 * email-specific notification behavior.
 * </p>
 *
 * @author Christopher Oji
 * @version 1.0
 */
public class EmailService implements NotificationMedium {

    /**
     * Creates a new EmailService.
     */
    public EmailService() {
        // Default constructor.
    }

    /**
     * Sends the given message as an email notification.
     *
     * @param message the message that will be sent by email
     */
    @Override
    public void send(String message) {
        System.out.println("Email notification sent: " + message);
    }
}
