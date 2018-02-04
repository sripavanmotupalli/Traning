package stringtokenizerexamples;

import java.util.StringTokenizer;

public class tokenizerexample {
	
	
	 
		 
	     public static void main(String args[]){  
		   StringTokenizer st = new StringTokenizer("My Name Is Motupalli Sri Pavan "," "); 
		   
		  /* String st1 = "My Name Is Motupalli Sri Pavan ";
		   
		   String[] words=st1.split("\\ ");//splits the string based on whitespace  
		 //using java foreach loop to print elements of string array  
		 for(String w:words){
		 System.out.println(w);*/
	     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  
		     }  
		   }  
	     }


