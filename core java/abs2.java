import java.util.Scanner;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
  static int m1(float a)
  {
	System.out.println(a);
	return sc.nextInt();
  }
  abstract void m2(int a);
  A(int a)
  {
    System.out.println(a);
  }
}
class B extends A
{
  
  B()
  {
	super(sc.nextInt());
  }
  void m2(int a)
  {
	System.out.print(a);
  }
  public static void main(String[]args)
  {
	A obj=new B();
	m1(sc.nextFloat());
     obj.m2(sc.nextInt());
  }
}
