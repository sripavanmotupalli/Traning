package Collections;

import java.util.*; 
public class DeQueueInterfaceExampleWithBook {
	
	    
		int id;    
		String name,author,publisher;    
		int quantity;    
		public DeQueueInterfaceExampleWithBook(int id, String name, String author, String publisher, int quantity) {    
		    this.id = id;    
		    this.name = name;    
		    this.author = author;    
		    this.publisher = publisher;    
		    this.quantity = quantity;    
		}    
		}    
	    class ArrayDequeExample {    
		public static void main(String[] args) {    
		    Deque<DeQueueInterfaceExampleWithBook> set=new ArrayDeque<DeQueueInterfaceExampleWithBook>();    
		    //Creating Books    
		    DeQueueInterfaceExampleWithBook b1=new DeQueueInterfaceExampleWithBook(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    DeQueueInterfaceExampleWithBook b2=new DeQueueInterfaceExampleWithBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    DeQueueInterfaceExampleWithBook b3=new DeQueueInterfaceExampleWithBook(103,"Operating System","Galvin","Wiley",6);    
		    //Adding Books to Deque   
		    set.add(b1);    
		    set.add(b2);    
		    set.add(b3);    
		    //Traversing ArrayDeque  
		    for(DeQueueInterfaceExampleWithBook b:set){    
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);    
		    }    
		}    


}
