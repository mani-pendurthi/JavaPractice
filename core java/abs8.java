import java.util.Scanner;
abstract class A
{
  static Scanner sc=new Scanner(System.in);
  A(int a)
  {
	System.out.println(a);
  }
  abstract int m1(float a);
  void m2(int a)
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
  float m3(char a)
  {
	System.out.println(a);
	return sc.nextFloat();
  }
  int m4(boolean b)
  {
	System.out.println(b);
	return sc.nextInt();
  }
  int m1(float a)
  {
	System.out.println(a);
	return sc.nextInt();
  }
  public static void main(String[]args)
  {
	A obj=new B();
	B obj1=(B) obj;
	obj.m2(sc.nextInt());
	obj.m1(sc.nextFloat());
	obj1.m3(sc.next().charAt(0));
	obj1.m4(sc.nextBoolean());
  }
}