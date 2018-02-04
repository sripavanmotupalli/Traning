package Collections;
import java.util.*;

public class HashSetExampleWithBook {


		int id;  
		String name,author,publisher;  
		int quantity;  
		public HashSetExampleWithBook(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}  
		}  
		 class HashSetExample {  
		public static void main(String[] args) {  
		    HashSet<HashSetExampleWithBook> set=new HashSet<HashSetExampleWithBook>();  
		    //Creating Books  
		    HashSetExampleWithBook b1=new HashSetExampleWithBook(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		    HashSetExampleWithBook b2=new HashSetExampleWithBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    HashSetExampleWithBook b3=new HashSetExampleWithBook(103,"Operating System","Galvin","Wiley",6);  
		    //Adding Books to HashSet  
		    set.add(b1);  
		    set.add(b2);  
		    set.add(b3);  
		    //Traversing HashSet  
		    for(HashSetExampleWithBook b:set){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		}  

	
}
