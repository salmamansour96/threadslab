package threadslab;

public class Simple  implements Runnable{
	private String threadname;
	public Simple(String n)
	{
		setThreadname(n);
		
		
	}
	public String getThreadname() {
		return threadname;
	}
	public void setThreadname(String threadname) {
		this.threadname = threadname;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+threadname);
try {
				
				Thread.sleep((int)Math.random()*1000);
			}
			
			catch(InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Done"+" "+threadname);
		
		
		
		
	}

}
