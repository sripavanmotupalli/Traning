package javaiofunctionsexamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterExample {
	
	public static void main(String[] args) throws IOException {  
			        File data = new File("E:\\sree.txt");  
			        FileOutputStream file = new FileOutputStream(data);  
			        FilterOutputStream filter = new FilterOutputStream(file);  
			        String s="Welcome to javaexample.";      
			        byte b[]=s.getBytes();      
			        filter.write(b);     
			        filter.flush();  
			        filter.close();  
			        file.close();  
		       System.out.println("Success...");  
			    }  


}
