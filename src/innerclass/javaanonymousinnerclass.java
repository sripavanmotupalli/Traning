package innerclass;

public  abstract class javaanonymousinnerclass {
		  
		  abstract void eat();  
		}  
    	class TestAnonymousInner{  
		 public static void main(String args[]){  
			 javaanonymousinnerclass p=new javaanonymousinnerclass(){  
		  void eat(){System.out.println("nice fruits");}  
		  };  
		  p.eat();  
		 }  


	

}
