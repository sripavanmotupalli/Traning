package Collections;
import java.util.*;  
public class HashMapBookExample {
	
 
		int id;    
		String name,author,publisher;    
		int quantity;    
		public HashMapBookExample(int id, String name, String author, String publisher, int quantity) {    
		    this.id = id;    
		    this.name = name;    
		    this.author = author;    
		    this.publisher = publisher;    
		    this.quantity = quantity;    
		}    
		}    
		 class MapExample1 {    
		public static void main(String[] args) {    
		    //Creating map of Books    
		    Map<Integer,HashMapBookExample> map=new HashMap<Integer,HashMapBookExample>();    
		    //Creating Books    
		    HashMapBookExample b1=new HashMapBookExample(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    HashMapBookExample b2=new HashMapBookExample(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    HashMapBookExample b3=new HashMapBookExample(103,"Operating System","Galvin","Wiley",6);    
		    //Adding Books to map   
		    map.put(1,b1);  
		    map.put(2,b2);  
		    map.put(3,b3);  
		      
		    //Traversing map  
		    for(Map.Entry<Integer, HashMapBookExample> entry:map.entrySet()){    
		        int key=entry.getKey();  
		        HashMapBookExample b=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		    }    
		}    


}
