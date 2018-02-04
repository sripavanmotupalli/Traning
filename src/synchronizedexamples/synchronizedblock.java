package synchronizedexamples;

public class synchronizedblock {
	
	void printTable(int n){  
			   synchronized(this){//synchronized block  
			     for(int i=1;i<=5;i++){  
			      System.out.println(n*i);  
			      try{  
			       Thread.sleep(400);  
			      }catch(Exception e){System.out.println(e);}  
			     }  
			   }  
			 }//end of the method  
			}  
			  
			class MyThread8 extends Thread{  
				synchronizedblock t;  
			MyThread8(synchronizedblock t){  
			this.t=t;  
			}  
			public void run(){  
			t.printTable(5);  
			}  
			  
			}  
			class MyThread9 extends Thread{  
				synchronizedblock t;  
			MyThread9(synchronizedblock t){  
			this.t=t;  
			}  
			public void run(){  
			t.printTable(100);  
			}  
			}  
			  
		      class TestSynchronizedBlock1{  
			public static void main(String args[]){  
				synchronizedblock obj = new synchronizedblock();//only one object  
			MyThread8 t1=new MyThread8(obj);  
			MyThread9 t2=new MyThread9(obj);  
			t1.start();  
			t2.start();  
			}  


}
