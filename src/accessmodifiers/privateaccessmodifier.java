package accessmodifiers;

//import java.text.Format;

/*public class privateaccessmodifier {
		   private String format;

		  public String getFormat() {
		     return this.format;
         }

		   public void setFormat(String format) {
		      this.format = format;
		   }
public static void main(String[] args) {

	privateaccessmodifier pa = new privateaccessmodifier();
	
	//System.out.println("Student Name :" +pa.format); Error for using private variable 
	System.out.println(pa.format);   //modification to clear the error of private using getter method
	}}
*/	


//The private access modifier is accessible only within class.



	class A{  
	private int data=40;  
	//private void msg(){  we can not use method  as private so we need to change the visibility
	
    void msg(){  //modification of that error
    	System.out.println("Hello java");
    	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}  
    }  

	public class privateaccessmodifier{  
 public static void main(String args[]){  
   A obj=new A();  
  // System.out.println(obj.data);//Compile Time Error  because of using private variable
   System.out.println(obj.getData()); //modification to clear the error of private using getter method
   
   
  obj.msg();//Compile Time Error  because we can not use method  as private so we need to change the visibility 
	   }  
	}  

	
	
	
	
	