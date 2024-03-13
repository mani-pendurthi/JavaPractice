package multithreading;

class A1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" ");
		}
	}
}
class B1 extends Thread
{
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i+" ");
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println(i+" ");
		}
	}
	
}
public class thread6 {

	public static void main(String[] args) throws InterruptedException
	{
		A1 obj=new A1();
		B1 obj1=new B1();
		C obj2=new C();
		obj.start();
		obj.join();
		obj1.start();
		obj1.join();
		obj2.start();
		obj2.join();
	}

}
