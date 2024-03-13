package multithreading;

import java.util.Scanner;

class C1
{
	//Scanner sc=new Scanner (System.in);
	float m1(String a)
	{
		System.out.println(a);
		return 1.2f;
	}
}
class C2
{
	Scanner sc=new Scanner(System.in);
	long m2(boolean b)
	{
		System.out.println(b);
		return 435554l;
	}
	
}
public class thread3 extends Thread
{
	//Scanner sc=new Scanner(System.in);
	public void run()
	{
		C1 obj1=new C1();
		System.out.println(obj1.m1("Mani"));
		C2 obj2=new C2();
		System.out.println(obj2.m2(true));
	}
	public static void main(String[] args) 
	{
		thread3 obj=new thread3();
		obj.start();
		thread3 obj1=new thread3();
		obj1.start();
	}
}
