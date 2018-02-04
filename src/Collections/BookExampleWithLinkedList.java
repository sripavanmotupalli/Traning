package Collections;

import java.util.*;  

public class BookExampleWithLinkedList {

	
		int id;  
		String name,author,publisher;  
		int quantity;  
		public BookExampleWithLinkedList(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}  
		}  
	 class LinkedListExample1 {  
		public static void main(String[] args) {  
		    //Creating list of Books  
		    List<BookExampleWithLinkedList> list=new LinkedList<BookExampleWithLinkedList>();  
		    //Creating Books  
		    BookExampleWithLinkedList b1=new BookExampleWithLinkedList(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		    BookExampleWithLinkedList b2=new BookExampleWithLinkedList(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    BookExampleWithLinkedList b3=new BookExampleWithLinkedList(103,"Operating System","Galvin","Wiley",6);  
		    //Adding Books to list  
		    list.add(b1);  
		    list.add(b2);  
		    list.add(b3);  
		    //Traversing list  
		    for(BookExampleWithLinkedList b:list){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		}  

}
