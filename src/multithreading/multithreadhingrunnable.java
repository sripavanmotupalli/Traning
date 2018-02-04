package multithreading;

public class multithreadhingrunnable implements Runnable {

	
	  
			public void run(){  
			System.out.println("thread is running...");  
			}  
			  
			public static void main(String args[]){  
				multithreadhingrunnable m1=new multithreadhingrunnable();  
			Thread t1 =new Thread(m1);  
			t1.start();  
			 }  

}
