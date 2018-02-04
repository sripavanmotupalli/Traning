package stringbuffers;

public class stringbuffersexamples {

	///   StringBuffer append() method
	
	

	     	public static void main(String args[]){  
			StringBuffer sb=new StringBuffer("Sree ");  
			sb.append("Pavan");//now original string is changed  
			System.out.println(sb);//prints Sree pavan  

	
			
    ////StringBuffer insert() method
			
			
				sb.insert(0,"M ");//now original string is changed  
				System.out.println(sb);//prints M Sree pavan

	////StringBuffer replace() method
				
				
					sb.replace(0,1,"Motupalli .");  
					System.out.println(sb);//prints Motupalli . Sree pavan   
					
					
	/////StringBuffer delete() method
					
					
						sb.delete(9,10);  
						System.out.println(sb);//prints Motupalli. Sree pavan   
						
						
						
		////StringBuilder reverse() method
						
						
							sb.reverse();  
							System.out.println(sb);//prints navaP eerS .illaputoM
							
							sb.reverse();
							System.out.println(sb);
							
		/////StringBuilder capacity() method
							
								System.out.println(sb.capacity());//default 44  
								sb.append("Hello");  
								System.out.println(sb.capacity());//now 44  
								sb.append("java is my favourite language");  
								System.out.println(sb.capacity());//now (44*2)+2=90 i.e (oldcapacity*2)+2  
								
								
								
								
		////StringBuilder ensureCapacity() method
								
								
									sb.ensureCapacity(10);//now no change  
									System.out.println(sb.capacity());//now 90  
									sb.ensureCapacity(50);//now (44*2)+2  
									System.out.println(sb.capacity());//now 90  
									
									
									
									
								
		////							
									





			
			
	     	}
	
	
}
