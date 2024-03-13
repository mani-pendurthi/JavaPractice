package multithreading;

public class thread10 extends Thread
{

	public static void main(String[] args) 
	{
		thread10 obj=new thread10();
		thread10 obj1=new thread10();
		Thread obj2=Thread.currentThread();
		System.out.println(obj.getPriority());
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
	}
}
