import java.util.Scanner;
abstract class A
{
  abstract void m1(float a);
  abstract void m2(int a);
  void m3(char c)
  {
	System.out.println("M3 Method");
  }
  A()
  {
	System.out.println("A const");
  }
}
class B extends A
{
  static Scanner sc=new Scanner(System.in);
  B()
  {
    super();
  }
  void m1(float a)
  {
	System.out.println("M1 Method");
  }
  void m2(int a)
  {
	System.out.println("M2 Method");
  }
  public static void main(String[]args)
  {
	A obj=new B();
	obj.m3(sc.next().charAt(0));
	obj.m1(sc.nextFloat());
	obj.m2(sc.nextInt());
  }
}
