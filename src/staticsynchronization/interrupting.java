package staticsynchronization;

public class interrupting extends Thread {

			  
			public void run(){  
			for(int i=1;i<=5;i++)  
			System.out.println(i);  
			}  
			  
			public static void main(String args[]){  
				interrupting t1=new interrupting();  
			t1.start();  
			  
			t1.interrupt();  
			  
			}  

}
