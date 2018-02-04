package todayclass;

public class stringconcatenation {

	
	//class TestStringConcatenation1{  
			 public static void main(String args[]){  
			   String s="  SREE"+" PAVAN";  
			   System.out.println(s);//SREE PAVAN  
			   
			   
			   String s1=50+30+"sachin"+40+40;  
			   	   System.out.println(s1);//80SREE4040  

			   	   
			   	   
			   	   
			   	   ///Java String toUpperCase() and toLowerCase() method
			   	   
			   	   
			   	    System.out.println(s1.toUpperCase());//SREE PAVAN  
			   		System.out.println(s.toLowerCase());//sree pavan 
			   		System.out.println(s);//SREE PAVAN(no change in original) 
			   		
			   		
			   		///Java String trim() method
			   		
			   			System.out.println(s);//  SREE PAVAN    
			   			System.out.println(s.trim());//SREEPAVAN
			   			
			   			
			   			///Java String startsWith() and endsWith() method
			   			
			   			
			   			System.out.println(s.startsWith("SR")); // FLASE IN THIS CASE IT CHECKS OF SPACE ALSO
			   			System.out.println(s.startsWith("  SR"));//true  
			   				 System.out.println(s.endsWith("N"));//true  

			   				 
			   				 
			   		//Java String charAt() method
			   				 
			   					System.out.println(s.charAt(0));// SPACE
			   					System.out.println(s.charAt(2));//S  
			   					System.out.println(s.charAt(7));//P 

			   					
			   	//Java String length() method
			   					
			   						System.out.println(s.length());//12
			   						
			   						
			   	//Java String intern() method
			   						
			   							String s3=s.intern();  
			   							System.out.println(s3);//  SREE PAVAN
			   							
			   	//Java String valueOf() method
			   							     int a=s.length();
			   								String s4=String.valueOf(a);  
			   								System.out.println(s4+10);  
			   								
			   								
			   								
             ///Java String replace() method

			   									String replaceString=s.replace(" SREE PAVAN","Motupalli");//replaces all occurrences of "sreepavan" to "Motupalli"
			   										System.out.println(replaceString);    
			   				 
			   										
			   //				 
			   				 

			   
			   
			 }  

	
}
