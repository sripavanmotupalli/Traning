package Serialization;

import java.io.Serializable;

public class staticdatamember implements Serializable {

	
	
			 int id;  
			 String name;  
			 static String company="SSS IT Pvt Ltd";//it won't be serialized  
			 public staticdatamember(int id, String name) {  
			  this.id = id;  
			  this.name = name;  
			 }  

	
}
