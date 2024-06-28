package interThread.realtimeExample;

public class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public synchronized void bookTicket(String name, int numberOfTickets) {
        System.out.println(name + " is trying to book " + numberOfTickets + " tickets.");
        while (availableTickets < numberOfTickets) {
            System.out.println("Not enough tickets for " + name + " to book " + numberOfTickets + " tickets. Waiting...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        availableTickets -= numberOfTickets;
        System.out.println(name + " successfully booked " + numberOfTickets + " tickets. Tickets left: " + availableTickets);
        notifyAll();
    }

    public synchronized void cancelTicket(String name, int numberOfTickets) {
        availableTickets += numberOfTickets;
        System.out.println(name + " canceled " + numberOfTickets + " tickets. Tickets left: " + availableTickets);
        notifyAll();
    }
}

