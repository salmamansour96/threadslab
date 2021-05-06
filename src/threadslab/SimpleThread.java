package  threadslab;
public class SimpleThread extends Thread {
	private String threadname;
	public SimpleThread(String n)
	{
		setThreadname(n);
		
		
	}
	public String getThreadname() {
		return threadname;
	}
	
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+threadname);
			try {
				
				sleep((int)Math.random()*1000);
			}
			
			catch(InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Done"+" "+threadname);
		
		
		
	}
	public void setThreadname(String threadname) {
		this.threadname = threadname;
	}
	
	

}
