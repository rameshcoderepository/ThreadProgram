package interThread;

//Visibility Guarantee: volatile guarantees that any thread that reads the field will see the most recently written value.
public class TicketBookingSystem implements Runnable {
    private volatile int availableTickets = 10;

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        bookTicket(threadName);
    }

    public void bookTicket(String threadName) {
        while (true) {
            if (availableTickets > 0) {
                System.out.println(threadName + " is booking a ticket.");
                try {
                    // Simulate some delay in booking
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                availableTickets--;
                System.out.println(threadName + " booked a ticket. Tickets left: " + availableTickets);
            } else {
                System.out.println("No tickets left to book for " + threadName);
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();
        Thread user1 = new Thread(bookingSystem, "User1");
        Thread user2 = new Thread(bookingSystem, "User2");
        Thread user3 = new Thread(bookingSystem, "User3");

        user1.start();
        user2.start();
        user3.start();
    }
}

//The volatile keyword ensures that changes to availableTickets are immediately visible to all threads.
//Without volatile, one thread might not see the updated value of availableTickets from another thread, leading to incorrect ticket counts and potential overbooking.
