import java.util.Scanner;
class A
{
	static Scanner sc = new Scanner(System.in);
	static int x = sc.nextInt();
	static boolean b = sc.nextBoolean();
	char c = sc.next().charAt(0);
	double d = sc.nextDouble();

	A()
	{	
		System.out.print("Default");
	}
	A(int a)
	{
		System.out.print(a);
		new A(new A());
	}
	A(A a)
	{
		System.out.print(a);
	}
	static int m1(float a)
	{
		System.out.print(a);
		return sc.nextInt();
	}
	static char m2(boolean b)
	{
		System.out.print(b);
		return sc.next().charAt(0);
	}
	static float m3(int a)
	{
		System.out.print(a);
		return sc.nextFloat();
	}
	String m4(double d)
	{
		System.out.print(d);
		return sc.next();
	}
	String m5(float d)
	{
		System.out.print(d);
		return sc.next();
	}
	long m6(char d)
	{
		System.out.print(d);
		return sc.nextLong();
	}

	public static void main(String[] args)
	{
		System.out.println(x);
		System.out.println(b);
		System.out.println(m1(sc.nextFloat()));
		System.out.println(m2(sc.nextBoolean()));
		System.out.println(m3(sc.nextInt()));
		A obj = new A(sc.nextInt());
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.m4(sc.nextDouble()));
		System.out.println(obj.m5(sc.nextFloat()));
		System.out.println(obj.m6(sc.next().charAt(0)));
	}
}




	


























	