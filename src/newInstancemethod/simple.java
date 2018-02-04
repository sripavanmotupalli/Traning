package newInstancemethod;

 class simple {

	
			 void message(){System.out.println("Hello Java");}  
			}  
			  
			class Test{  
			 public static void main(String args[]){  
			  try{  
			  Class c=Class.forName("Simple");  
			  simple s=(simple)c.newInstance();  
			  s.message();  
			  
			  }catch(Exception e){System.out.println(e);}  
			  
			 }  

	
}
