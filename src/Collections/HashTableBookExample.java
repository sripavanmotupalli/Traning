package Collections;
import java.util.*;  
public class HashTableBookExample {
				      
		int id;    
		String name,author,publisher;    
		int quantity;    
		public HashTableBookExample(int id, String name, String author, String publisher, int quantity) {    
		    this.id = id;    
		    this.name = name;    
		    this.author = author;    
		    this.publisher = publisher;    
		    this.quantity = quantity;    
		}    
		}    
		class HashtableExample {    
		public static void main(String[] args) {    
		    //Creating map of Books    
		    Map<Integer,HashTableBookExample> map=new Hashtable<Integer,HashTableBookExample>();    
		    //Creating Books    
		    HashTableBookExample b1=new HashTableBookExample(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    HashTableBookExample b2=new HashTableBookExample(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    HashTableBookExample b3=new HashTableBookExample(103,"Operating System","Galvin","Wiley",6);    
		    //Adding Books to map   
		    map.put(1,b1);  
		    map.put(2,b2);  
		    map.put(3,b3);      
		    //Traversing map  
		    for(Map.Entry<Integer, HashTableBookExample> entry:map.entrySet()){    
		        int key=entry.getKey();  
		        HashTableBookExample b=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		    }    
		}    


}
