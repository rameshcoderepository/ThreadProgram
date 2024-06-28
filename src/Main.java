
class SharedClass {

	static int a = 10;

	synchronized static void sharedMethod() {

		for (int i = 1; i < 5; i++) {
			try {
				a++;
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

}

class MyThread1 extends Thread {

	public void run() {
		SharedClass.sharedMethod();
	}

}

class MyThread2 extends Thread {

	public void run() {
		SharedClass.sharedMethod();
	}
}

public class Main {
	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();

		MyThread2 t3 = new MyThread2();
		MyThread2 t4 = new MyThread2();

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
