package javaiofunctionsexamples;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class chararraywriterexample {

		public static void main(String args[])throws Exception{    
			          CharArrayWriter out=new CharArrayWriter();    
			          out.write("Welcome to javaexample");    
			          FileWriter f1=new FileWriter("S:\\a.txt");    
			          FileWriter f2=new FileWriter("S:\\b.txt");    
			          FileWriter f3=new FileWriter("S:\\c.txt");    
			          FileWriter f4=new FileWriter("S:\\d.txt");    
			          out.writeTo(f1);    
			          out.writeTo(f2);    
			          out.writeTo(f3);    
			          out.writeTo(f4);    
			          f1.close();    
			          f2.close();    
			          f3.close();    
			          f4.close();    
			          System.out.println("Success...");    
			         }    

}
