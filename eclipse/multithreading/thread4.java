package multithreading;

public class thread4 extends Thread
{
	public void run()
	{
		for(int i=5;i>=1;i--)
		{
			System.out.print(i+" ");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception a)
			{
				System.out.println("Exception");
			}
		}
	}
	public static void main(String[] args) 
	{
		thread4 obj=new thread4();
		obj.start();
	}
}