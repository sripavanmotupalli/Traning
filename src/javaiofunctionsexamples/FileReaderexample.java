package javaiofunctionsexamples;

import java.io.FileReader;

public class FileReaderexample
{

	
		 
		    public static void main(String args[])throws Exception{    
		          FileReader fr=new FileReader("E:\\sree.txt");    
		          int i;    
		          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
		          fr.close();    
		    }    
		}    


