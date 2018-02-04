package todayclass;

public class objectcloninginjava  implements Cloneable{
		//class Student18 implements Cloneable{  
			int rollno;  
			String name;  
			  
			objectcloninginjava(int rollno,String name){  
			this.rollno=rollno;  
			this.name=name;  
			}  
			  
			public Object clone()throws CloneNotSupportedException{  
			return super.clone();  
			}  
			  
			public static void main(String args[]){  
			try{  
				objectcloninginjava s1=new objectcloninginjava(1601010219,"pavan");  
				objectcloninginjava s2=new objectcloninginjava(1601010219,"sree pavan");
				objectcloninginjava s3=(objectcloninginjava)s1.clone();  
				objectcloninginjava s4=(objectcloninginjava)s2.clone();
			  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);
			System.out.println(s3.rollno+" "+s3.name);
			System.out.println(s4.rollno+" "+s4.name);
			  
			}catch(CloneNotSupportedException c){}  
			  
			}  
			}  



