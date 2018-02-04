package Collections;

import java.util.*;  

public class ListiteratorInterfaceWithBook {
		
		
		int id;  
		String name,author,publisher;  
		int quantity;  
		public ListiteratorInterfaceWithBook(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}  
		}  
		 class ListExample {  
		public static void main(String[] args) {  
		    //Creating list of Books  
		    List<ListiteratorInterfaceWithBook> list=new ArrayList<ListiteratorInterfaceWithBook>();  
		    //Creating Books  
		    ListiteratorInterfaceWithBook b1=new ListiteratorInterfaceWithBook(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		    ListiteratorInterfaceWithBook b2=new ListiteratorInterfaceWithBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    ListiteratorInterfaceWithBook b3=new ListiteratorInterfaceWithBook(103,"Operating System","Galvin","Wiley",6);  
		    //Adding Books to list  
		    list.add(b1);  
		    list.add(b2);  
		    list.add(b3);  
	    //Traversing list  
		    for(ListiteratorInterfaceWithBook b:list){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		}  

	
	
}
