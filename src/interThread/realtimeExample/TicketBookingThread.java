package interThread.realtimeExample;

public class TicketBookingThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private String name;
    private int numberOfTickets;

    public TicketBookingThread(TicketBookingSystem bookingSystem, String name, int numberOfTickets) {
        this.bookingSystem = bookingSystem;
        this.name = name;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(name, numberOfTickets);
    }
}

