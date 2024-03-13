package multithreading;

public class thread8 extends Thread
{

	
	public static void main(String[] args) throws InterruptedException
	{
		thread8 obj1=new thread8();
		thread8 obj2=new thread8();
		Thread obj3=Thread.currentThread();
		Thread obj4=Thread.currentThread();
		
		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());
		System.out.println(obj3.isAlive());
		System.out.println(obj4.isAlive());
		obj1.start();
		obj2.start();
		System.out.println("After Start method");
		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());
		System.out.println(obj3.isAlive());
		System.out.println(obj4.isAlive());
		System.out.println("suspend method");
		obj1.suspend();
		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());
		System.out.println("After Sleep method");
		obj1.sleep(600);
		obj2.sleep(600);
		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());
		System.out.println(obj3.isAlive());
		System.out.println(obj4.isAlive());
		System.out.println("After stop method");
		obj1.stop();
		obj2.stop();
		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());
		System.out.println(obj3.isAlive());
		System.out.println(obj4.isAlive());
		
	}

}
