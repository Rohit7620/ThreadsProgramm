/*
 Naming Thread : 
 - The Thread class provides methods to change and get the name of a thread.
 - each thread has a name, i.e. thread-0, thread-1 and so on.
 - By we can change the name of the thread by using the setName() method.
 - The syntax of setName() and getName() methods are given below:
- public String getName(): is used to return the name of a thread. 
- public void setName(String name): is used to change the name of a thread. 
 
 - Example of naming a thread : Using setName() & getName() Method
 */

package NamingThread;

public class Naming extends Thread
{

	public void run()
	{  
		System.out.println("running...");  
	}
	public static void main(String args[])
	{  
		  Naming t1=new Naming();  
		  Naming t2=new Naming();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		   
		  t1.start();  
		  t2.start();  
		  
		  t1.setName("Rohit G"); 
		  t2.setName("MSD");
		  System.out.println("After changing name of t1:"+t1.getName());  
		  System.out.println("After changing name of t2:"+t2.getName());
	}
}
