package interThread;

import java.util.LinkedList;
import java.util.Queue;

//Using wait, notify, and notifyAll correctly ensures that the producer and consumer can operate smoothly without running into race conditions or deadlocks.

//Here, the producer thread produces items and puts them into a shared queue, and the consumer thread consumes items from the queue.

class ProducerConsumer {
	private final Queue<Integer> queue = new LinkedList<>();
	private final int LIMIT = 10;
	private final Object lock = new Object();

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (lock) {
				while (queue.size() == LIMIT) {
					lock.wait();
				}
				queue.add(value);
				System.out.println("Produced: " + value);
				value++;
				lock.notify();
			}
			Thread.sleep(1000); // Simulate time taken to produce
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (lock) {
				while (queue.isEmpty()) {
					lock.wait();
				}
				int value = queue.poll();
				System.out.println("Consumed: " + value);
				lock.notify();
			}
			Thread.sleep(1000); // Simulate time taken to consume
		}
	}

	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer();
		Thread producerThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumerThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producerThread.start();
		consumerThread.start();
	}
}
