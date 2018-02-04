package innerclass;

public interface  nextedinterface {
	
	
		  
			  void show();  
			  interface Message{  
			   void msg();  
			  }  
			}  
			class TestNestedInterface1 implements nextedinterface.Message{  
			 public void msg(){System.out.println("Hello nested interface");}  
			  
			 public static void main(String args[]){  
				 nextedinterface.Message message=new TestNestedInterface1();//upcasting here  
			  message.msg();  
			 }  


}
