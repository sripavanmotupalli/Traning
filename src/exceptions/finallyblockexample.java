package exceptions;

public class finallyblockexample {
	
	
	//Let's see the java finally example where exception doesn't occur.
		//class TestFinallyBlock{  
		  public static void main(String args[]){  
		  try{  
		   int data=25/5;  
		   System.out.println(data);  
		  } 
		  catch(NullPointerException e){
			  System.out.println(e);
			  }  
		  finally{
			  System.out.println("finally block is always executed");
			  }  
		  System.out.println("rest of the code...");  
		  }  
		}  

	


