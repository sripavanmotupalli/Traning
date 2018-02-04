package exceptions;

public class coustomeexception extends Exception {

	
	coustomeexception(String s){  
			  super(s);  
			 }  
			}  
			class TestCustomException2{  
			  
			   static void validate(int age)throws coustomeexception{  
			     if(age<18)  
			      throw new coustomeexception("not valid");  
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
