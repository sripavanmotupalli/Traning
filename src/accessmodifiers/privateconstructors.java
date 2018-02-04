package accessmodifiers;



/*Role of Private Constructor
If you make any class constructor private,
you cannot create the instance of that class from outside the class. */

	
	
public class privateconstructors {

	class A{  
		private A(){}//private constructor  
		
			void msg(){System.out.println("Hello java");}  
			}  
			public class Simple{  
			 public void main(String args[])
			 {
				 
				 //public static void main(String args[]) 
				 /** because we can not create the instance of the private 
				                                             constructor outside the class **/			  
				 A obj=new A();//Compile Time Error  
				 obj.msg();
			 }  
			}  

}
