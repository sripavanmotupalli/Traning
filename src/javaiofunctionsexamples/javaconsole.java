package javaiofunctionsexamples;

import java.io.Console;

public class javaconsole {
	
		public static void main(String args[]){    
			Console c=System.console();    
			System.out.println("Enter your name: ");    
			//String n=c.readLine();  
			String n = c.readLine();
			System.out.println("Welcome "+n);    
			}    


}
