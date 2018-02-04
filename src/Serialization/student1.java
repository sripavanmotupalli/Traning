package Serialization;

import java.io.Serializable;

public class student1 implements Serializable {

	
	
		 int id;  
		 String name;  
		 AdderssSerializationwithAggregation address;//HAS-A  
		 public student1(int id, String name) {  
		  this.id = id;  
		  this.name = name;  
		 }  

		 }

