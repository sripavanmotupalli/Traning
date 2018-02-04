package innerclass;

	import java.io.PrintStream;  
	class Outer$Inner 
	{  
	    final Outer$Inner this$0;  
	    Outer$Inner()  
	    {   super();  
	        this$0 = Outer$Inner.this;  
	    }  
	    void msg()  
	    {  
	        System.out.println((new StringBuilder()).append("data is "));
	                   // .append(Outer$Inner.access$000(Outer$Inner.this)).toString());  
	    }  
	}  


