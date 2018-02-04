package Collections;

import java.util.*;
public class BookExampleWithArrayList {

 
			int id;  
			String name,author,publisher;  
			int quantity;  
			public  BookExampleWithArrayList(int id, String name, String author, String publisher, int quantity) {  
			    this.id = id;  
			    this.name = name;  
			    this.author = author;  
			    this.publisher = publisher;  
			    this.quantity = quantity;  
			}  
			}  
			class ArrayListexp {  
			public static void main(String[] args) {  
			    //Creating list of Books  
			    List< BookExampleWithArrayList> list=new ArrayList< BookExampleWithArrayList>();  
			    //Creating Books  
			    BookExampleWithArrayList b1=new  BookExampleWithArrayList(101,"Let us C","Yashwant Kanetkar","BPB",8);  
			    BookExampleWithArrayList b2=new  BookExampleWithArrayList(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
			    BookExampleWithArrayList b3=new  BookExampleWithArrayList(103,"Operating System","Galvin","Wiley",6);  
			    //Adding Books to list  
			    list.add(b1);  
			    list.add(b2);  
			    list.add(b3);  
			    //Traversing list  
			    for( BookExampleWithArrayList b:list){  
			        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
			    }  
			}  

}
