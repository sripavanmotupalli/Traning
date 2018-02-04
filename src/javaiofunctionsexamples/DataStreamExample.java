package javaiofunctionsexamples;

import java.io.FileInputStream;

public class DataStreamExample {

		     public static void main(String args[]){    
			          try{    
			            FileInputStream fin=new FileInputStream("E:\\sree.txt");    
			            int i=fin.read();  
			            int j=0;
			            System.out.print((char)i); 
			               
			            	            while((j=fin.read())!=-1){    
			            	             System.out.print((char)j);    
			            	            }    
			            	            fin.close();    
			            	          }catch(Exception e){
			            	        	  System.out.println(e);
			            	        	  }    
			            	         }    

			            
			  
			          

	
}
