package innerclass;

public class Javastaticnestedclass {
	
	
	static int data=30;  
		  static class Inner{  
			  	   void msg(){System.out.println("data is "+data);}  
		  }  
		  public static void main(String args[]){  
			  Javastaticnestedclass.Inner obj=new Javastaticnestedclass.Inner();  
		  obj.msg();  
		  }  


}
