package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {
	
	
	
	public static void main(String args[])throws Exception{  
		   
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("E://f.txt"));  
			  Student s=(Student)in.readObject();  
			  System.out.println(s.id+" "+s.name);  
			  
			  in.close();  
			 }  


}
