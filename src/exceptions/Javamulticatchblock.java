package exceptions;

public class Javamulticatchblock {
	//	public class TestMultipleCatchBlock{  
		   public static void main(String args[]){  
			   try{  
			    int a[]=new int[5];  
			    a[5]=30/0;  
			   }  
                    catch(ArithmeticException e){
                    	System.out.println("Task1 completed" +e);
                    }
 
			   catch(ArrayIndexOutOfBoundsException e){
				   System.out.println("task 2 completed");
				   }  
			   catch(Exception e){
				   System.out.println("common task completed");
				   }
			   System.out.println("rest of the code...");  
			 }  

	
	/// if you change catch(exception e ) first and catch (arithmeticexception e)  if will run a compile error 

}
