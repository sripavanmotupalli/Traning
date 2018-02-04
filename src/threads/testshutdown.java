package threads;

public class testshutdown {

	
	
	  
	public static void main(String[] args)throws Exception {  
	  
	Runtime r=Runtime.getRuntime();  
	r.addShutdownHook(new javashutdownhook());  
	      
	System.out.println("Now main sleeping... press ctrl+c to exit");  
 try{Thread.sleep(3000);}catch (Exception e) {}  
	}  


	}

