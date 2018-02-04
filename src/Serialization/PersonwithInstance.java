package Serialization;

import java.io.Serializable;

public class PersonwithInstance implements Serializable {
	
	/////Java Serialization with Inheritance (IS-A Relationship)
	
	
	
	int id;  
		 String name;  
		 PersonwithInstance(int id, String name) {  
		  this.id = id;  
		  this.name = name;  
		 }  
		 
		class Student extends PersonwithInstance{  
		 String course;  
		 int fee;  
		 public Student(int id, String name, String course, int fee) {  
		  super(id,name);  
		  this.course=course;  
		  this.fee=fee;  
		 }  


}

		}