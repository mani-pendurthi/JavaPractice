import java.util.Scanner;
abstract class A
{
  abstract void m1(int a);
  abstract void m2();
}
class B extends A
{
  static Scanner sc=new Scanner(System.in);
  void m1(int a)
  {
	System.out.println(a);
	System.out.println("M1 method");
  }
  void m2()
  {
	System.out.println("M2 method");
  }
  public static void main(String[]args)
  {
	A obj=new B();
	obj.m1(sc.nextInt());
	obj.m2();
  }
}