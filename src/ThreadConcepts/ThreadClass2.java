package ThreadConcepts;

public class ThreadClass2 extends Thread {

//	SharedClass instance;
//
//	public ThreadClass2(SharedClass instance) {
//		this.instance = instance;
//	}

	@Override
	public void run() {
		SharedClass.sharedMethod();
	}
}
