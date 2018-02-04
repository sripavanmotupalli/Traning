package JavaTransientExamples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersist {

	
		 public static void main(String args[])throws Exception{  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("E://f.txt"));  
			  javaTransient s=(javaTransient)in.readObject();  
			  System.out.println(s.id+" "+s.name+" "+s.age);  
			  in.close();  
			 }  
			}  




//Age is 0 because age is a static object and its not serialization....