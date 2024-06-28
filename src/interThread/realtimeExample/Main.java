package interThread.realtimeExample;

public class Main {
	public static void main(String[] args) {
		TicketBookingSystem bookingSystem = new TicketBookingSystem(10);

		Thread t1 = new TicketBookingThread(bookingSystem, "Suresh", 5);
		Thread t2 = new TicketBookingThread(bookingSystem, "Dinesh", 6);
		Thread t3 = new TicketCancellationThread(bookingSystem, "Charlie", 2);
		Thread t4 = new TicketBookingThread(bookingSystem, "Deep", 4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

//When a thread tries to book more tickets than available, it waits until tickets are available. 
//When tickets are canceled, all waiting threads are notified so they can attempt to book tickets again.
