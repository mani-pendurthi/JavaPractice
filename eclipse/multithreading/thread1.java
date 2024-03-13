package multithreading;

import java.util.*;

public class thread1 extends Thread
{

	public static void main(String[] args) 
	{
		
		//Scanner sc=new Scanner(System.in);
		thread1 obj=new thread1 ();
		thread1 obj1=new thread1 ();
		thread1 obj2=new thread1 ();
		Thread obj4=Thread.currentThread();
		Thread obj5=Thread.currentThread();
		Thread obj6=Thread.currentThread();
		System.out.println("Default names of new threads");
		System.out.println(obj.getName());
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		obj.setName("Multi threads-1");
		obj1.setName("Multi threads-2");
		obj2.setName("Multi threads-3");
		System.out.println("New Names of new threads");
		System.out.println(obj.getName());
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		System.out.println("current thread names");
		System.out.println(obj4.getName());
		System.out.println(obj5.getName());
		System.out.println(obj6.getName());
		obj4.setName("New Main");
		System.out.println("Current thread New names");
		System.out.println(obj4.getName());
		System.out.println(obj5.getName());
		System.out.println(obj6.getName());
		
	}
}
