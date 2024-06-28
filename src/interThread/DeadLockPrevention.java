package interThread;
//ensuring that locks are acquired in the same order.
public class DeadLockPrevention {
	public static void main(String[] args) {
		final Object lock1 = new Object();
		final Object lock2 = new Object();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("Thread 1: Holding lock 1...");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					System.out.println("Thread 1: Waiting for lock 2...");

					synchronized (lock2) {
						System.out.println("Thread 1: Holding lock 1 & 2...");
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("Thread 2: Holding lock 1...");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					System.out.println("Thread 2: Waiting for lock 2...");

					synchronized (lock2) {
						System.out.println("Thread 2: Holding lock 1 & 2...");
					}
				}
			}
		});

		t1.start();
		t2.start();
	}
}
