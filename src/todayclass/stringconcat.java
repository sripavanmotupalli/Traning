package todayclass;

public class stringconcat {

	
//	class Testimmutablestring{  
		 public static void main(String args[]){  
			   String s="Sree";  
			   s.concat(" pavan ");//concat() method appends the string at the end  
			 String  s1=s.concat("Motupalli");
			   System.out.println(s);//will print Sachin because strings are immutable objects  
			   System.out.println(s1);
			  
			   //STRING EQUAL CASE
			   
			       System.out.println(s1.equals(s));//FALSE  
			   	   System.out.println(s1.equals(s1));//true  
			   	   System.out.println(s1.equals(s.concat(s)));//false 
			   	   
			   	 //STRING EQUAL IGNORE CASE   
			  
			     System.out.println(s1.equalsIgnoreCase(s));//FALSE
			     System.out.println(s1.equalsIgnoreCase(s1));//TRUE
			     
			     // STRING== OPERATOR
			     
			     String s2=new String("SREE");  
			        System.out.println(s1==s1);//true (because both refer to same instance)  
			        System.out.println(s1==s2);//false(because s3 refers to instance created in nonpool) 
			        
			        
			        
			        //String compare by compareTo() method
			        
			        System.out.println(s1.compareTo(s1));//0  
			        	   System.out.println(s1.compareTo(s2));//1(because s1>s3)  
			        	   System.out.println(s2.compareTo(s));//-1(because s3 < s1 )  
			        	   
			        	   
			        	   



			     

			   
			   
			   
			 }  
			  

}
