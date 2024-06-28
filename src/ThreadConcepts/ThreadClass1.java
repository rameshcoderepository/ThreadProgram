package ThreadConcepts;

public class ThreadClass1 extends Thread {

//	SharedClass instance;
//
//	public ThreadClass1(SharedClass instance) {
//		this.instance = instance;
//	}

	@Override
	public void run() {

		SharedClass.sharedMethod();
	}

}
