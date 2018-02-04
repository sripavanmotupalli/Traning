package Collections;
import java.util.*; 
public class EnumMapExampleWithBook {
	   
		int id;    
		String name,author,publisher;    
		int quantity;    
		public EnumMapExampleWithBook(int id, String name, String author, String publisher, int quantity) {    
		    this.id = id;    
		    this.name = name;    
		    this.author = author;    
		    this.publisher = publisher;    
		    this.quantity = quantity;    
		}    
		}    
		 class EnumMapExample {   
		// Creating enum  
		    public enum Key{  
		           One, Two, Three  
		           };  
		public static void main(String[] args) {    
		    EnumMap<Key, EnumMapExampleWithBook> map = new EnumMap<Key, EnumMapExampleWithBook>(Key.class);  
		    // Creating Books    
		    EnumMapExampleWithBook b1=new EnumMapExampleWithBook(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    EnumMapExampleWithBook b2=new EnumMapExampleWithBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    EnumMapExampleWithBook b3=new EnumMapExampleWithBook(103,"Operating System","Galvin","Wiley",6);    
		    // Adding Books to Map   
		       map.put(Key.One, b1);  
		       map.put(Key.Two, b2);  
		       map.put(Key.Three, b3);  
		    // Traversing EnumMap  
		       for(Map.Entry<Key, EnumMapExampleWithBook> entry:map.entrySet()){      
		    	   EnumMapExampleWithBook b=entry.getValue();    
		            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);     
		        }       
		}    

}
