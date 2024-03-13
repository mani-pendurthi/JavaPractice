/*create a java app to satisfy This at method level*/

import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);

	int m1(float a)
	{
		m2(sc.nextInt());
		System.out.print("M1");
		return sc.nextInt();
	}
	float m2(int b)
	{
		this.m3(sc.nextFloat());
		System.out.print("M2");
		return sc.nextFloat();
	}
	char m3(float c)
	{
		System.out.print("M3");
		return sc.next().charAt(0);
	} 
	public static void main(String[]args)
	{
		new A().m1(sc.nextFloat());
	}
} 