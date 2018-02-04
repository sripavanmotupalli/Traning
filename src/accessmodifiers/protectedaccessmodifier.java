package accessmodifiers;

/*The protected access modifier is accessible within package 
and outside the package but through inheritance only.*/




public class protectedaccessmodifier {

		//save by A.java  
	//package pack;  
	//public class A{  
	
	
	protected void msg(){System.out.println("Hello");}  
		}  
		//save by B.java  
    	//package mypack;  
		//import pack.*;  
	  
		class B extends protectedaccessmodifier{  //inheritance of protected class
		  public static void main(String args[]){  
		   B obj = new B();  
		   obj.msg();  
		  }  
		}  


