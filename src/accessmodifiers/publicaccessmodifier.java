package accessmodifiers;

// you can use public class any where 

public class publicaccessmodifier {
	//package pack;  
		//public class A{  
		 void msg()
		{
			System.out.println("Hello");
		}  
		
		//save by B.java  
		  
		//package accessmodifiers;  
		//import pack.*;  
		  
		//class B{  
			public static void main(String[] args) 
	  {  
	   publicaccessmodifier obj = new publicaccessmodifier();  
	   obj.msg();  
	  }  
	}  



