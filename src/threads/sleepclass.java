package threads;

public class sleepclass extends Thread{

	
	
	
			 public void run(){  
			  for(int i=1;i<6;i++){  
			    try{Thread.sleep(500);}catch(InterruptedException e){
			    	System.out.println(e);
			    	}  
			    System.out.println(i);  
			  }  
			 }  
			 public static void main(String args[]){  
				 sleepclass t1=new sleepclass();  
				 sleepclass t2=new sleepclass();  
			   
			  t1.start();  
			  t2.start();  
			 }  

	
}
