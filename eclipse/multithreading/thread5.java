package multithreading;

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.print(i+" ");
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=50;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}
	
}
public class thread5  extends Thread
{
	public void run()
	{
		A obj1=new A();
		obj1.start();
		B obj2=new B();
		obj2.start();
	}
	public static void main(String[] args) 
	{
		thread5 obj=new thread5();
		obj.start();
	}
}
