package innerclass;

public class memberinnerclass {

	
	  
			 private int data=30;  
			 class Inner{  
			  void msg(){
				  System.out.println("data is "+data);
				  }  
			 }  
			 public static void main(String args[]){  
			  memberinnerclass obj=new memberinnerclass();  
		     memberinnerclass.Inner in =obj.new Inner();  
			  in.msg();  
			 }  

}
