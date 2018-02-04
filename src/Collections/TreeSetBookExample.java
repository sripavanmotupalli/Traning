package Collections;
import java.util.*;  

public class TreeSetBookExample implements Comparable<TreeSetBookExample> {
	
	 
		int id;  
		String name,author,publisher;  
		int quantity;  
		public TreeSetBookExample(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}  
		public int compareTo(TreeSetBookExample b) {  
		    if(id>b.id){  
		        return 1;  
		    }else if(id<b.id){  
		        return -1;  
		    }else{  
		    return 0;  
		    }  
		}  
		}  
		 class TreeSetExample1 {  
		public static void main(String[] args) {  
	    Set<TreeSetBookExample> set=new TreeSet<TreeSetBookExample>();  
	    //Creating Books  
	    TreeSetBookExample b1=new TreeSetBookExample(121,"Let us C","Yashwant Kanetkar","BPB",8);  
	    TreeSetBookExample b2=new TreeSetBookExample(233,"Operating System","Galvin","Wiley",6);  
	    TreeSetBookExample b3=new TreeSetBookExample(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    //Adding Books to TreeSet  
		    set.add(b1);  
		    set.add(b2);  
		    set.add(b3);  
		    //Traversing TreeSet  
		    for(TreeSetBookExample b:set){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		}  


}
