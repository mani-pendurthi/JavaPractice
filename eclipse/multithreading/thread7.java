package multithreading;

class A2 extends Thread
{
	public void run()
	{
		for(char i='a';i<='z';i++)
		{
			System.out.println(i+" ");
		}
	}
}
class B2 extends Thread
{
	public void run()
	{
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i+" ");
		}
	}
}
public class thread7 {

	public static void main(String[] args) 
	{
		A2 obj=new A2();
		B2 obj1=new B2();
		
		obj.start();
		obj1.start();
		obj1.suspend();
		
		while(true)
		{
			if(!(obj.isAlive()))
			{
				obj1.resume();
				break;
			}
		}
	}
}
