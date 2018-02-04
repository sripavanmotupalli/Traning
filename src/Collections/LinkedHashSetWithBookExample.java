package Collections;
import java.util.*; 

public class LinkedHashSetWithBookExample {

	 
		int id;  
		String name,author,publisher;  
		int quantity;  
		public LinkedHashSetWithBookExample(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}  
		}  
		class LinkedHashSetExample {  
		public static void main(String[] args) {  
		    LinkedHashSet<LinkedHashSetWithBookExample> hs=new LinkedHashSet<LinkedHashSetWithBookExample>();  
		    //Creating Books  
		    LinkedHashSetWithBookExample b1=new LinkedHashSetWithBookExample(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		    LinkedHashSetWithBookExample b2=new LinkedHashSetWithBookExample(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    LinkedHashSetWithBookExample b3=new LinkedHashSetWithBookExample(103,"Operating System","Galvin","Wiley",6);  
		    //Adding Books to hash table  
		    hs.add(b1);  
		    hs.add(b2);  
		    hs.add(b3);  
		    //Traversing hash table  
		    for(LinkedHashSetWithBookExample b:hs){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		}  

	
	
}
