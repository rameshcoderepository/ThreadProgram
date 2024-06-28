package interThread;

// Ticket Booking System
//Imagine a ticket booking system where there are multiple resources such as a database connection and a payment gateway. Two threads (Thread A and Thread B) try to book tickets simultaneously and end up in a deadlock situation.
//
//Scenario:
//Thread A locks the database connection to fetch available seats.
//Thread B locks the payment gateway to process the payment for another ticket.
//Thread A now tries to lock the payment gateway to complete the booking process but is blocked because Thread B has already locked it.
// Thread B now tries to lock the database connection to verify seat availability but is blocked because Thread A has already locked it.
//Both threads are now waiting for each other to release the resources they need to proceed, resulting in a deadlock

public class DeadlockExample {

	public static void main(String[] args) {
		final Object resource1 = "Database Connection";
		final Object resource2 = "Payment Gateway";

		// Thread A
		Thread threadA = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread A: locked resource 1 (Database Connection)");

				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}

				synchronized (resource2) {
					System.out.println("Thread A: locked resource 2 (Payment Gateway)");
				}
			}
		});

		// Thread B
		Thread threadB = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread B: locked resource 2 (Payment Gateway)");

				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}

				synchronized (resource1) {
					System.out.println("Thread B: locked resource 1 (Database Connection)");
				}
			}
		});

		threadA.start();
		threadB.start();
	}
}
