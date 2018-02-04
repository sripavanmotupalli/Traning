

public class studenttestclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student  stud =new student();
		studentsubjects studsub = new studentsubjects();
		studentmarks studmark = new studentmarks();
		
		/*System.out.println("Student Id :" +stud.employeid );
	
		System.out.println("Student Name :" +stud.employename);
		
		System.out.println("Student DateOfBirth :" +stud.dateString); 
		
		System.out.println("Student Adders :" +stud.Adders);
		
		System.out.println("Student Average Mark :" +studmark.Average);*/
		
		//System.out.println("Student Subject  : " + "\t" +studsub.subject1 + "\t" +studsub.subject2  + "\t" +studsub.subject3 + "\t" +studsub.subject4 + "\t" +studsub.subject5);
		
		
		//System.out.println("Student Marks : " + "\t" +studmark.java + "\t" +studmark.C + "\t" +studmark.Dbs + "\t" +studmark.Oops + "\t" +studmark.Testing);
		
		
		
		
		System.out.println("Student Id   StudentName  AverageMark  : "     +studsub.subject1 
				+ "\t" +studsub.subject2  + "\t" +studsub.subject3 
				+ "\t" +studsub.subject4 + "\t" +studsub.subject5);
		
		System.out.println(+stud.employeid+ "\t"+stud.employename+ "\t"+studmark.Average+ "\t"
		+studmark.java + "\t" +studmark.C + "\t" +studmark.Dbs 
				+ "\t" +studmark.Oops + "\t" +studmark.Testing);
		
	}
}

