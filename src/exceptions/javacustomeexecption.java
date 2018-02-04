package exceptions;

import javax.imageio.IIOException;

public class javacustomeexecption extends Exception {
	
	
	
		  
			 javacustomeexecption(String s){  
			  super(s);  
			 }  
			}  
			class TestCustomException1{  
			  
			   static void validate(int age)throws Exception{  
			     if(age<18)  
			      throw new Exception("not valid");  
			     else  
			      System.out.println("welcome to vote");  
			   }  
			     
			   public static void main(String args[]){  
			      try{  
			      validate(13);  
			      }catch(Exception m){System.out.println("Exception occured: "+m);}  
			  
			      System.out.println("rest of the code...");  
			  }  
			}  



