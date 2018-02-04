package exceptions;

public class Exceptionexamples {

	////Scenario where ArithmeticException occurs
	
	public static void main (String []args){
		
	
		int a=50/0;//ArithmeticException  
	
		
		
		//Scenario where NullPointerException occurs
		
		
			String s=null;  
			System.out.println(s.length());//NullPointerException  

			
			
			//Scenario where NumberFormatException occurs
			
			
			String s1="abc";  
				int i=Integer.parseInt(s);//NumberFormatException  
				
				
		//Scenario where ArrayIndexOutOfBoundsException occurs		

		
			int b[]=new int[5];  
			b[10]=50; //ArrayIndexOutOfBoundsException  

			
		
	}
	
}
