package multithreading;

class A4
{
	int m1(int a)
	{
		System.out.println("M1 Method");
		return 10;
	}
	char m2(float b)
	{
		System.out.println("M2 Method");
		return 'r';
	}
}
public class thread9 extends A4 implements Runnable
{
	public void run()
	{
		System.out.println("Run Method");
	}
	public static void main(String[] args) 
	{
		thread9 obj=new thread9();
		Thread t1=new Thread(obj);
		obj.m1(5);
		obj.m2(4.9f);
		t1.start();
	}

}
