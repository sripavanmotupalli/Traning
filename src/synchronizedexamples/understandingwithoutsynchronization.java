package synchronizedexamples;

public class understandingwithoutsynchronization {

	/*
	 * ///Understanding the problem without Synchronization In this example,
	 * there is no synchronization, so output is inconsistent. Let's see the
	 * example:
	 */

	void printTable(int n) {// method not synchronized
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

class MyThread1 extends Thread {
	understandingwithoutsynchronization t;

	MyThread1(understandingwithoutsynchronization t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	understandingwithoutsynchronization t;

	MyThread2(understandingwithoutsynchronization t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class TestSynchronization1 {
	public static void main(String args[]) {
		understandingwithoutsynchronization obj = new understandingwithoutsynchronization();// only
																							// one
																							// object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();

	}

}
