import java.util.Scanner;
abstract class A
{
  static Scanner sc=new Scanner(System.in);
  abstract int m1(float b);
  abstract void m2(int a);
  
}
abstract class B extends A
{
  
  B(int a)
  {
	System.out.println(a);
  }
  abstract boolean m3(int a);
  void m2(int a)
  {
	System.out.print(a);
  }
}
class C extends B
{
  C()
  {
	super(sc.nextInt());
  }
  int m1(float b)
  {
	return sc.nextInt();
  }
  boolean m3(int a)
  {
	return sc.nextBoolean();
  }
  public static void main(String[]args)
  {
	B obj=new C();
     obj.m1(sc.nextFloat());
	obj.m2(sc.nextInt());
	obj.m3(sc.nextInt());
  }
}