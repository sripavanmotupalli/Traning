package Collections;
import java.util.*; 
public class TreeMapWithBookExample {

		     
		int id;    
		String name,author,publisher;    
		int quantity;    
		public TreeMapWithBookExample(int id, String name, String author, String publisher, int quantity) {    
		    this.id = id;    
		    this.name = name;    
		    this.author = author;    
		    this.publisher = publisher;    
		    this.quantity = quantity;    
		}    
		}    
		 class MapExample3 {    
		public static void main(String[] args) {    
		    //Creating map of Books    
		    Map<Integer,TreeMapWithBookExample> map=new TreeMap<Integer,TreeMapWithBookExample>();    
		    //Creating Books    
		    TreeMapWithBookExample b1=new TreeMapWithBookExample(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    TreeMapWithBookExample b2=new TreeMapWithBookExample(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    TreeMapWithBookExample b3=new TreeMapWithBookExample(103,"Operating System","Galvin","Wiley",6);    
		    //Adding Books to map   
		    map.put(2,b2);  
		    map.put(1,b1);  
		    map.put(3,b3);  
		      
		    //Traversing map  
		    for(Map.Entry<Integer, TreeMapWithBookExample> entry:map.entrySet()){    
		        int key=entry.getKey();  
		        TreeMapWithBookExample b=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		    }    
		}    

	
}
