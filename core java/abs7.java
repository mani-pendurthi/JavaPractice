import java.util.Scanner;
abstract class A
{
  static Scanner sc=new Scanner(System.in);
  A(int a)
  {
	System.out.println(a);
  }
  abstract void m1(int a,int b);
  abstract void m2(int a,int b);
  abstract void m3(int a,int b);
}
class B extends A
{
  B()
  {
	super(sc.nextInt());
  }
  void m1(int a,int b)
  {
	System.out.println(a+b);
  }
  void m2(int a,int b)
  {
	System.out.println(a+b);
  }
  void m3(int a,int b)
  {
	System.out.println(a+b);
  }
}
class C extends A
{
  C()
  {
	super(sc.nextInt());
  }
  void m1(int a,int b)
  {
	System.out.println(a*b);
  }
  void m2(int a,int b)
  {
	System.out.println(a*b);
  }
  void m3(int a,int b)
  {
	System.out.println(a*b);
  }
}
class D extends A
{
  D()
  {
	super(sc.nextInt());
  }
  void m1(int a,int b)
  {
	System.out.println(a-b);
  }
  void m2(int a,int b)
  {
	System.out.println(a-b);
  }
  void m3(int a,int b)
  {
	System.out.println(a-b);
  }
}
class Test
{
  static Scanner sc=new Scanner (System.in);
  A display(A obj)
  {
	obj.m1(5,4);
	obj.m2(4,3);
	obj.m3(8,7);
	return obj;
  }
  public static void main(String[]args)
  {
	Test obj=new Test();
	B obj1=new B();
	C obj2=new C();
	D obj3=new D();
	System.out.println(obj.display(obj1));
	System.out.println(obj.display(obj2));
	System.out.println(obj.display(obj3)); 
  }
}
