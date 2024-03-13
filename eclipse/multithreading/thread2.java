package multithreading;

public class thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[]args)
	{
		thread2 obj=new thread2();
		obj.start();
		for(int i=10;i<20;i++)
		{
			System.out.print(i+" ");
		}
	}
}
