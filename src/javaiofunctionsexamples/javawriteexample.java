package javaiofunctionsexamples;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class javawriteexample {
	
	public static void main(String[] args) {  
			        try {  
			            Writer w = new FileWriter("output.txt");  
			            String content = "I love my country";  
		            w.write(content);  
			            w.close();  
		            System.out.println("Done");  
			        } catch (IOException e) {  
			            e.printStackTrace();  
			        }  
			    }  


}
