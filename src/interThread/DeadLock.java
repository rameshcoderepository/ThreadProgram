package interThread;


public class DeadLock {
	public static void main(String[] args) throws InterruptedException {
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
				synchronized (lock2) {
					System.out.println("Thread 2: Holding lock 2...");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					System.out.println("Thread 2: Waiting for lock 1...");

					synchronized (lock1) {
						System.out.println("Thread 2: Holding lock 2 & 1...");
					}
				}
			}
		});

		t1.start();
		t2.start();

	}
}

//Thread 1 acquires lock1 and then tries to acquire lock2.
//Thread 2 acquires lock2 and then tries to acquire lock1.
//Both threads are now waiting for each other to release the locks they need, resulting in a deadlock.
