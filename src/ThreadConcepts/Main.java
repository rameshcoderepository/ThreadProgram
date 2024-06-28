package ThreadConcepts;

public class Main {

	public static void main(String[] args) {
		
//		SharedClass s1= new SharedClass();
//		SharedClass s2= new SharedClass();

		ThreadClass1 t1= new ThreadClass1();
		ThreadClass1 t2= new ThreadClass1();
		
		ThreadClass2 t3 = new ThreadClass2();
		ThreadClass2 t4 = new ThreadClass2();
		
		t1.start();
		t2.start();
		
		t3.start();
		t4.start();
	}
}
