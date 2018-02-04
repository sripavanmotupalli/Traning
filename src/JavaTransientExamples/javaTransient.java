package JavaTransientExamples;
import java.io.Serializable;  
public class javaTransient implements Serializable{
	
	
	
	////Example of Java Transient Keyword
	
	

		 
		 int id;  
		 String name;  
		 transient int age;//Now it will not be serialized  
		 public javaTransient(int id, String name,int age) {  
		  this.id = id;  
		  this.name = name;  
		  this.age=age;  
		 }  


}
