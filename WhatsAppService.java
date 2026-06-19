/**
 * Sends notification messages through a WhatsApp service.
 * <p>
 * This class extends the flexible notification system by implementing the
 * existing NotificationMedium interface. It does not require changes to the
 * AlertSystem class because AlertSystem depends on the interface rather than
 * a specific service class.
 * </p>
 *
 * @author Christopher Oji
 * @version 1.0
 */
public class WhatsAppService implements NotificationMedium {

    /**
     * Creates a new WhatsAppService.
     */
    public WhatsAppService() {
        // Default constructor.
    }

    /**
     * Sends the given message as a WhatsApp notification.
     *
     * @param message the message that will be sent by WhatsApp
     */
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}
