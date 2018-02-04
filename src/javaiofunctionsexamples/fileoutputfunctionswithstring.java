package javaiofunctionsexamples;

	import java.io.FileOutputStream;  
	public class fileoutputfunctionswithstring {  
	    public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             String s="Welcome to javakjkkjjkjkjkpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
	}  
