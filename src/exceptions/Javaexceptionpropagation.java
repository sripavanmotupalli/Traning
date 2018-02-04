package exceptions;

public class Javaexceptionpropagation {
	
		  void m(){  
			    int data=50/0;  
			  }  
			  void n(){  
			    m();  
			  }  
			  void p(){  
			   try{  
			    n();  
			   }
			   catch(Exception e){
				   System.out.println("exception handled");
				   }  
			  }  
			  public static void main(String args[]){  
				  Javaexceptionpropagation obj=new Javaexceptionpropagation();  
			   obj.p();  
			   System.out.println("normal flow...");  
			  }  


}
