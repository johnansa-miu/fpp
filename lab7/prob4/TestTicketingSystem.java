package lab7.prob4;

public class TestTicketingSystem {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();

        // Add tickets
        system.addTicket("Login issue");
        system.addTicket("Payment problem");
        system.addTicket("Account locked");

        // View next ticket
        system.viewNextTicket();

        // Process tickets
        system.processTicket();
        system.processTicket();

        // View next after processing
        system.viewNextTicket();

        // Process remaining
        system.processTicket();

        // Try to process when empty
        system.processTicket();
    }
}
