package exceptions;

public class Problemwithoutexceptionhandling {


	/*//	public class Testtrycatch1{  
			  public static void main(String args[]){  
			      int data=50/0;//may throw exception  
			      System.out.println("rest of the code...");  
*/

			      
			      
			      
			      
			      
			   //   Solution by exception handling

			      
			      public static void main(String args[]){ 
			    	  try{
				      int data=50/0;//may throw exception 
			    	  }
			    	  catch (ArithmeticException e)
			    	  {System.out.println(e);
			    	  }  
				      System.out.println("rest of the code..."); 
			      
			      
			      
			  }
}
