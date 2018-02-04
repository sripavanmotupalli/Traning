package accessmodifiers;

/*If you don't use any modifier, it is treated as default bydefault.
The default modifier is accessible only within package.*/

public class defaultaccessmodifier {
		//save by A.java  
		//package pack;  
		//class A{
	
	  void msg(){System.out.println("Hello");}  
		}  
		//save by B.java  
	//	package accessmodifiers;  
	//	import pack.*;  
		class c{  
		 // public void main(String args[]){  
			  
			   public static void main(String [] args){
				   /*in default no need of using static because we dont explicity 
			  declare for class field and method*/
			  
			  
		   defaultaccessmodifier obj = new defaultaccessmodifier();//Compile Time Error  
		   obj.msg();//Compile Time Error  
		  }  
		}

	
//}
