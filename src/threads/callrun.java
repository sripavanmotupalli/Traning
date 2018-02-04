package threads;

public class callrun {

	
	  
			 public void run(){  
			   System.out.println("running...");  
			 }  
			 public static void main(String args[]){  
				 callrun t1=new callrun();  
			  t1.run();//fine, but does not start a separate call stack  
			 }  

}
