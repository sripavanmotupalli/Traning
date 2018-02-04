package innerclass;

public class javalocalinnerclass {
	
	
		
		 private int data=30;//instance variable  
		 void display(){  
		  class Local{  
		   void msg(){System.out.println(data);}  
		  }  
		  Local l=new Local();  
		  l.msg();  
		 }  
		 public static void main(String args[]){  
			 javalocalinnerclass obj=new javalocalinnerclass();  
		  obj.display();  
		 }  


}
