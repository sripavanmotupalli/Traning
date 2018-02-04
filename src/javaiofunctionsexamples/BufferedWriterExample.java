package javaiofunctionsexamples;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
	
	
		public static void main(String[] args) throws Exception {     
			    FileWriter writer = new FileWriter("E:\\sree.txt");  
			    BufferedWriter buffer = new BufferedWriter(writer);  
			    buffer.write("Welcome to javaexample.");  
			    buffer.close();  
			    System.out.println("Success");  
			    }  


}
