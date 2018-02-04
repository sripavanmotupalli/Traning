package threads;

public class demonthreading extends Thread{

	
	  
			 public void run(){  
			  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			   System.out.println("daemon thread work");  
			  }  
			  else{  
			  System.out.println("user thread work");  
			 }  
			 }  
			 public static void main(String[] args){  
				 demonthreading t1=new demonthreading();//creating thread  
				 demonthreading t2=new demonthreading();  
				 demonthreading t3=new demonthreading();  
			  
			  t1.setDaemon(true);//now t1 is daemon thread  
			    
			  t1.start();//starting threads  
			  t2.start();  
			  t3.start();  
		 }  

}
