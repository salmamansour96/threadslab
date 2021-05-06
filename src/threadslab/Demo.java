package threadslab;

public class Demo {
	
	public static void  main(String []args)
	{
		new SimpleThread("Thread object 1").start();
		new SimpleThread("Thread object 2").start();
		new Thread(new Simple("Runnable object ")).start();
		
	}

}
