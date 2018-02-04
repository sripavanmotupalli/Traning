package Collections;
import java.util.*;
public class QueueExampleWithBook implements Comparable<QueueExampleWithBook> {
		  
		 
		int id;  
		String name,author,publisher;  
		int quantity;  
		public QueueExampleWithBook(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}  
		public int compareTo(QueueExampleWithBook b) {  
		    if(id>b.id){  
		        return 1;  
		    }else if(id<b.id){  
		        return -1;  
		    }else{  
		    return 0;  
		    }  
		}  
		}  
		 class LinkedListExample3 {  
		public static void main(String[] args) {  
		    Queue<QueueExampleWithBook> queue=new PriorityQueue<QueueExampleWithBook>();  
		    //Creating Books  
		    QueueExampleWithBook b1=new QueueExampleWithBook(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		    QueueExampleWithBook b2=new QueueExampleWithBook(233,"Operating System","Galvin","Wiley",6);  
		    QueueExampleWithBook b3=new QueueExampleWithBook(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    //Adding Books to the queue  
		    queue.add(b1);  
		    queue.add(b2);  
		    queue.add(b3);  
		    System.out.println("Traversing the queue elements:");  
		    //Traversing queue elements  
		    for(QueueExampleWithBook b:queue){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		    queue.remove();  
		    System.out.println("After removing one book record:");  
		    for(QueueExampleWithBook b:queue){  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		        }  
		  

	
		}}
