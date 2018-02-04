package exceptions;

public class finallize {
	
	
	public void finalize(){
		System.out.println("finalize called");
		}  
	
	public static void main(String[] args){  
	finallize f1=new finallize();  
	finallize f2=new finallize();  
	f1=null;  
	f2=null;  
	System.gc();  


}
	}
