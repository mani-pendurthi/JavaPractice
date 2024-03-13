import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  A(int a)
  {
	System.out.println(a);
  }
  int m1(float a)
  {
	System.out.println();
	return sc.nextInt();
  }
  
}
abstract class B extends A
{
  B(float b)
  {
	super(sc.nextInt());
  }
  int m2(char c)
  {
	System.out.println(c);
	return sc.nextInt();
  }
  abstract float m3(int a);
}
class C extends B
{
  C()
  {
    super(sc.nextFloat());
  }
  float m3(int a)
  {
	System.out.println(a);
	return sc.nextFloat();
  }
  public static void main(String []args)
  {
	B obj=new C();
	obj.m1(sc.nextFloat());
	obj.m2(sc.next().charAt(0));
	obj.m3(sc.nextInt());
  }
}