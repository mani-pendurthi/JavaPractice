import java.util.Scanner;
abstract class A
{
  static Scanner sc=new Scanner(System.in);
  A(int a)
  {
	System.out.println(a);
  }
  int m1(float b)
  {
	System.out.println(b);
	return sc.nextInt();
  }
  abstract void m2(char d);
  abstract int m3(int a);
}
class B
{
  B(float a)
  {
	System.out.println(a);
  }
  void m4(int a)
  {
	System.out.println(a);
  }
}
class C extends A
{
  C()
  {
	super(sc.nextInt());
  }
  void m2(char d)
  {
	System.out.println(d);
  }
  int m3(int a)
  {
	System.out.println(a);
	return sc.nextInt();
  }
  public static void main(String[]args)
  {
	A obj=new C();
	B obj1=new B(sc.nextFloat());
	obj.m1(sc.nextFloat());
     obj.m2(sc.next().charAt(0));
	obj.m3(sc.nextInt());
	obj1.m4(sc.nextInt());
  }
}