package Serialization;
import java.io.*; 
public class JavaSerialization {

	
	
		 
		 public static void main(String args[])throws Exception{  
		  Student s1 =new Student(211,"Sree Pavan");  
		  
		  FileOutputStream fout=new FileOutputStream("E://f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		  out.flush();  
		  System.out.println("success");  
		 }  

}
