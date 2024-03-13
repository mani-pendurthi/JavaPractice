import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  String c=sc.next();
  A(float a)
  {
	this(sc.next().charAt(0));
	System.out.println(a);
  }
  A(char d)
  {
	System.out.println(d);
  }
  void m2(String c)
  {
	System.out.println(c);
	System.out.println(this.c);
	this.m3();
  }
  void m3()
  {
	System.out.println("M3 Class-A");
  }
}
class B extends A
{
  char c=sc.next().charAt(0);
  B(int a)
  {
	super(sc.nextFloat());
  }
  void m1(char c)
  {
	super.m2(sc.next());
	System.out.println(c);
	System.out.println(super.c);
  }
  public static void main(String []args)
  {
	B obj=new B(sc.nextInt());
     obj.m1(sc.next().charAt(0));
  }

}