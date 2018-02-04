package javagarbagge;

public class javagarbageexamples {

	
		  
			 public void finalize(){
				 System.out.println("object is garbage collected");
				 }  
			 public static void main(String args[]){  
				 
				 
				 javagarbageexamples s1=new javagarbageexamples();  
			  javagarbageexamples s2=new javagarbageexamples();  
			  s1=null;  
			  s2=null;  
			  System.gc(); 
			  
			  
			 }  

	
}
