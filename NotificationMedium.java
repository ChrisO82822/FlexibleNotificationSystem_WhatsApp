/**
 * Defines the behavior required for any notification delivery medium.
 * <p>
 * Classes that implement this interface can send messages using different
 * communication services, such as email or SMS.
 * </p>
 *
 * @author Christopher Oji
 * @version 1.0
 */
public interface NotificationMedium {

    /**
     * Sends a notification message.
     *
     * @param message the message that will be sent to the user
     */
    void send(String message);
}
