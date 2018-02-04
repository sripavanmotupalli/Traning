package todayclass;

public class stringbufferclass {

		public static void main(String args[]){  
			StringBuffer sb=new StringBuffer("Hello ");  
			sb.append("Java");//now original string is changed  
			System.out.println(sb);//prints Hello Java  
			
			
			//StringBuffer insert() method
			
				sb.insert(1,"Java");//now original string is changed  
				System.out.println(sb);//prints HJavaello  

				
				
				//) StringBuffer replace() method
				
					sb.replace(1,3,"Java");  
					System.out.println(sb);//prints HJavalo  
					
					
					//StringBuffer delete() method
					
			         	sb.delete(1,3);  
						System.out.println(sb);//prints Hlo  
						
						//StringBuffer reverse() method
						
							sb.reverse();  
				       	System.out.println(sb);//prints olleH  
				       	
				       	
				       	//StringBuffer capacity() method
				       	
				         	System.out.println(sb.capacity());//default 22  
				       		sb.append("Hello");  
				       		System.out.println(sb.capacity());//now 22  
				        	sb.append("java is my favourite language");  
				        	System.out.println(sb.capacity());//now (22*2)+2=48 i.e (oldcapacity*2)+2  
				        	
				        	
				        	
				        	//StringBuffer ensureCapacity() method
				        	
				        		System.out.println(sb.capacity());//default 48  
				        		sb.append("Hello java");  
				        		System.out.println(sb.capacity());//now 48  
				        		sb.append("java is my favourite language");  
				        		System.out.println(sb.capacity());//now (48*2)+2=98 i.e (oldcapacity*2)+2  
				        		sb.ensureCapacity(5);//now no change  
				        		System.out.println(sb.capacity());//now 98  
				        		sb.ensureCapacity(40);//now (98*2)+2  
				        		System.out.println(sb.capacity());//now   98

				       	  




			}  
		
		
		

}
