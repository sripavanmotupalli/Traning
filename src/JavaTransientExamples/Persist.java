package JavaTransientExamples;
import java.io.*;
public class Persist {
	  
		
		 public static void main(String args[])throws Exception{  
			 javaTransient s1 =new javaTransient(211,"Sree Pavan",22);//creating object  
	  //writing object into file  
		  FileOutputStream f=new FileOutputStream("E://f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(f);  
		  out.writeObject(s1);  
		  out.flush();  
		  
		  out.close();  
		  f.close();  
		  System.out.println("success");  
		 }  

}
