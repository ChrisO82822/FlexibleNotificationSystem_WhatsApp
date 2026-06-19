import java.util.ArrayList;

/**
 * Manages notification delivery by using composition.
 * <p>
 * The AlertSystem class contains a NotificationMedium object instead of
 * inheriting from a specific notification service. This design allows the
 * active notification medium to be changed at runtime.
 * </p>
 *
 * @author Christopher Oji
 * @version 1.0
 */
public class AlertSystem {

    private NotificationMedium medium;
    private ArrayList<String> messageLog;

    /**
     * Creates an AlertSystem with the provided notification medium.
     *
     * @param medium the notification medium used to send messages
     */
    public AlertSystem(NotificationMedium medium) {
        this.medium = medium;
        this.messageLog = new ArrayList<>();
    }

    /**
     * Changes the active notification medium.
     *
     * @param medium the new notification medium to use
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a message using the currently active notification medium.
     * <p>
     * The message is also added to the message log for the current session.
     * </p>
     *
     * @param message the message to send to the user
     */
    public void notifyUser(String message) {
        if (medium == null) {
            System.out.println("No notification medium selected.");
            return;
        }

        medium.send(message);
        messageLog.add(message);
    }

    /**
     * Displays all messages sent during the current session.
     */
    public void printMessageLog() {
        System.out.println("\nMessage Log:");

        if (messageLog.isEmpty()) {
            System.out.println("No messages have been sent.");
            return;
        }

        for (int i = 0; i < messageLog.size(); i++) {
            System.out.println((i + 1) + ". " + messageLog.get(i));
        }
    }

    /**
     * Demonstrates the flexible notification system from the command line.
     *
     * @param args command-line arguments, not used in this program
     */
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem(new EmailService());

        alertSystem.notifyUser("Your account login was successful.");

        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("Your verification code is 482913.");

        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("Your monthly account statement is ready.");

        alertSystem.printMessageLog();
    }
}
