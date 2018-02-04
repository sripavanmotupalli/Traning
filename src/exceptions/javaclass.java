package exceptions;

public class javaclass {
	
	private int data=30;  
		 class Inner{  
		  void msg(){
			  System.out.println("data is "+data);
			  }  
		 }  
		 public static void main(String args[]){  
		  javaclass obj=new javaclass();  
		  javaclass.Inner in=obj.new Inner();  
		  in.msg();  
		 }  


}
