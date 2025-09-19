package lab7.prob4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private final Queue<Ticket> ticketQueue;
    private int nextId;

    public TicketingSystem() {
        ticketQueue = new LinkedList<>();
        nextId = 1;
    }

    public void addTicket(String description) {
        Ticket ticket = new Ticket(nextId++, description);
        ticketQueue.add(ticket);
        System.out.println("Added ticket: " + ticket);
    }

    public void processTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
            return;
        }
        Ticket ticket = ticketQueue.poll();
        System.out.println("Processed ticket: " + ticket);
    }

    public void viewNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in queue.");
            return;
        }

        Ticket next = ticketQueue.peek();
        System.out.println("Next ticket: " + next);
    }
}
