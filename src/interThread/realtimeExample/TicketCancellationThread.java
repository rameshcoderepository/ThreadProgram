package interThread.realtimeExample;

public class TicketCancellationThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private String name;
    private int numberOfTickets;

    public TicketCancellationThread(TicketBookingSystem bookingSystem, String name, int numberOfTickets) {
        this.bookingSystem = bookingSystem;
        this.name = name;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        bookingSystem.cancelTicket(name, numberOfTickets);
    }
}

