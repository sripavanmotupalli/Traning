package JavaUrl;
import java.io.*;  
import java.net.*;
public class JavaURLConnectionclass {
	
		  
		 
		public static void main(String[] args){  
		try{  
		URL url=new URL("https://www.teksystems.com/it-jobs/results?keyword=java");  
		URLConnection urlcon=url.openConnection();  
		InputStream stream=urlcon.getInputStream();  
		int i;  
		while((i=stream.read())!=-1){  
		System.out.print((char)i);  
		}  
		}catch(Exception e){System.out.println(e);}  
		}  


}
