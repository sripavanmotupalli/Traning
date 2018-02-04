package threads;

public class singletaskbymultithreading extends Thread{
	
	
	 
			 public void run(){  
			   System.out.println("task one");  
			 }  
			 public static void main(String args[]){  
				 singletaskbymultithreading t1=new singletaskbymultithreading();  
				 singletaskbymultithreading t2=new singletaskbymultithreading();  
				 singletaskbymultithreading t3=new singletaskbymultithreading();  
			  
			  t1.start();  
			  t2.start();  
			  t3.start();  
			 }  


}
