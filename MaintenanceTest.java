/**
 * Tests the maintenance enhancement for the flexible notification system.
 * <p>
 * This test confirms that EmailService, SMSService, and WhatsAppService can be
 * switched at runtime using the existing AlertSystem.setMedium method. The
 * AlertSystem class and NotificationMedium interface are not modified.
 * </p>
 *
 * @author Christopher Oji
 * @version 1.0
 */
public class MaintenanceTest {

    /**
     * Creates a new MaintenanceTest.
     */
    public MaintenanceTest() {
        // Default constructor.
    }

    /**
     * Runs the command-line test for the maintenance enhancement.
     *
     * @param args command-line arguments, not used in this program
     */
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem(new EmailService());

        alertSystem.notifyUser("Email alert for account update.");

        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("SMS alert for verification code.");

        alertSystem.setMedium(new WhatsAppService());
        alertSystem.notifyUser("WhatsApp alert for appointment reminder.");

        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("Email alert for monthly statement.");

        alertSystem.printMessageLog();
    }
}
