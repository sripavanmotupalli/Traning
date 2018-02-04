package usingsetersandgeters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner input  = new Scanner(System.in);
	
	//	 List<String> list = new ArrayList<String>();
		 
		 List list = new ArrayList();
		 
		
		student  stud =new student(1601010219, "Motupalli Sri Pavan", "02/14/1993", "868 S 5th Street,SanJose,CA,95112");
		studentsubjects studsub = new studentsubjects("java","C","Dbs","Oops","Testing");
		studentmarks studmark = new studentmarks(85, 75, 85, 80, 90, 80);
		
		
		
		System.out.println("Student Id :" +stud.employeid);
	
		//System.out.println("Student Name :" +stud.employename); Error for using private variable 
		
		System.out.println("Student Name :" +stud.getEmployename()); //modification to clear the error of private using getter method
		
		
		System.out.println("Student DateOfBirth :" +stud.dateString); 
		
		System.out.println("Student Adders :" +stud.Adders);
		
		System.out.println("Student Average Mark :" +studmark.Average);
		
		System.out.println("Student Subject  : " + "\t" +studsub.subject1 + "\t" +studsub.subject2  + "\t" +studsub.subject3 + "\t" +studsub.subject4 + "\t" +studsub.subject5);
		
		
		System.out.println("Student Marks : " + "\t" +studmark.java + "\t" +studmark.C + "\t" +studmark.Dbs + "\t" +studmark.Oops + "\t" +studmark.Testing);
		
	
	
}
}