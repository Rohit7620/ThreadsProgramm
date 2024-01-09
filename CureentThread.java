/*
- The currentThread() method returns a reference of the currently executing thread
- Syntax : public static Thread currentThread() 
- Ex : Example of currentThread() method
 */
package NamingThread;

public class CureentThread extends Thread
{
	 public void run()
	 {  
		  System.out.println(Thread.currentThread().getName());  
		 }  
		 public static void main(String args[]){  
			 CureentThread t1=new CureentThread();  
			 CureentThread t2=new CureentThread();  
		  
		  t1.start();  
		  t2.start();  
		 }  

}
