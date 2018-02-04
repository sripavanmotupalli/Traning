package threads;

public class threadtwice extends Thread{

	
	
			 public void run(){  
			   System.out.println("running...");  
			 }  
			 public static void main(String args[]){  
				 threadtwice t1=new threadtwice();  
			  t1.start();  
			  t1.start();  
		 }  

}
