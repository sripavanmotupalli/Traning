package multithreading;

public class multithreadingexamples extends Thread {

		//class Multi extends Thread{  
			public void run(){  
			System.out.println("thread is running...");  
		}  
			public static void main(String args[]){  
				multithreadingexamples t1=new multithreadingexamples();  
			t1.start();  
			 }  

	
	
}
