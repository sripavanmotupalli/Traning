package todayclass;

//save as Student.java  
//package com.java;  
//public class Student{  
 public class encapsulation {
	 
 private String name;  
		public String getName(){  
		return name;  
		}  
		public void setName(String name){  
		this.name=name ; 
		}  
		}  
		//save as Test.java  
		//package com.java;  
		class Test{  
		public static void main(String[] args){  
		//Student s=new Student();  
			encapsulation enc = new encapsulation();
		enc.setName("pavan");  
		System.out.println(enc.getName());  
		}  
		}  


