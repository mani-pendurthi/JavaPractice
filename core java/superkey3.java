import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  A()
  {
	System.out.println("A Def Para");
  }
  void m2()
  {
	System.out.println("A M2");
  }
}
class B extends A
{
  int a=sc.nextInt();
  B()
  {
	super();
	System.out.println("B Default");
  }
  B(int a)
  {
	this();
	System.out.println("B Para");
  }
  void m2(float b)
  {
	super.m2();
	System.out.println("B M2");
  }
}
class C extends B
{
  int a=sc.nextInt();
  C()
  {
	super(sc.nextInt());
	System.out.println("C Default");
	
  }
  void m1()
  {
	super.m2(sc.nextFloat());
	System.out.println("A="+a);
	System.out.println("Super A="+super.a);
	System.out.print("C M1");
  }
  public static void main(String[] args)
  {
	C obj=new C();
	obj.m1();
  }
}

