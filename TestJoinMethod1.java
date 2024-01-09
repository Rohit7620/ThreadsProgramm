package JoiningThread;
//The TestJoinMethod1 class is the child class of the class Thread  
class TestJoinMethod1 extends Thread
{    // overriding the run method  
	 public void run()
	 {    
	  for(int i=1;i<=5;i++)
	  {    
	   try
	   {    
	    Thread.sleep(500);   // sleeping the thread for 500 milli seconds  
	   }
	   catch(Exception e)// catch block for catching the raised exception  
	   {
		   System.out.println(e);
	   }    
	  System.out.println(i);    
	  }    
	 }    
	// main method
	public static void main(String args[])
	{    
		  
		// creating 3 threads  
	 TestJoinMethod1 t1=new TestJoinMethod1();    
	 TestJoinMethod1 t2=new TestJoinMethod1();    
	 TestJoinMethod1 t3=new TestJoinMethod1(); 
	// thread th1 starts  
	 t1.start();   
	// starting the second thread after when  
	// the first thread t1 has ended or died.  
	 try
	 {    
	  t1.join();    // invoking the join() method  
	 }
	 catch(Exception e) // catch block for catching the raised exception  
	 {
		 System.out.println(e);
	 }    
	   
	// thread t2 starts
	// thread t3 starts
	 t2.start();    
	 t3.start();    
	 }    
}    
