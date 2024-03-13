import java.util.Scanner;
class A
{
	static Scanner obj=new Scanner (System.in);

	static int a=obj.nextInt();
	static float b=obj.nextFloat();
		  char c=obj.next().charAt(0);
	void m1()
     {
		System.out.print("Hello java");
	}
	public static void main(String [] args)
	{
		A n=new A ();
		System.out.println(a);
		System.out.println(b);
		System.out.println(n.c);

		n.m1();
	}
}