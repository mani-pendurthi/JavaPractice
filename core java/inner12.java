import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner (System.in);
   int m1(float a)
   {
	System.out.println("M1");
	class B
	{
	   float m2(int a)
	   {
		System.out.println("M2");
		return sc.nextFloat();
	   }
	}
	   B obj=new B();
	   obj.m2(sc.nextInt());
	return sc.nextInt();
   }
   public static void main(String[]args)
   {
	A obj=new A();
	obj.m1(sc.nextFloat());
   }
}