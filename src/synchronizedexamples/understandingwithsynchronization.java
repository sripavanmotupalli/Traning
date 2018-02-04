package synchronizedexamples;

public class understandingwithsynchronization {

	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread5 extends Thread {
	understandingwithsynchronization t;

	MyThread5(understandingwithsynchronization t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread6 extends Thread {
	understandingwithsynchronization t;

	MyThread6(understandingwithsynchronization t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class TestSynchronization3 {

	public static void main(String args[]) {
		understandingwithsynchronization obj = new understandingwithsynchronization();// only
																						// one
																						// object
		MyThread5 t1 = new MyThread5(obj);
		t1.start();
		MyThread6 t2 = new MyThread6(obj);		
		t2.start();
	}

}