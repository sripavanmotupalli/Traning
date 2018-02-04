package join;

public class joinexample extends Thread {

	
		 
			 public void run(){  
			  for(int i=1;i<=5;i++){  
			   try{  
			    Thread.sleep(500);  
			   }catch(Exception e){System.out.println(e);}  
			  System.out.println(i);  
			  }  
			 }  
			public static void main(String args[]){  
				joinexample t1=new joinexample();  
				joinexample t2=new joinexample();  
				joinexample t3=new joinexample();  
			 t1.start();  
			 try{  
			  t1.join();  
			 }catch(Exception e){System.out.println(e);}  
			  
			 t2.start();  
			 t3.start();  
			 }  

}
