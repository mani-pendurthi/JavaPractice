import java.util.Scanner;
class A
{
  int m1(int a)
  {
	System.out.println(a);
	return a;
  }
}
class B extends A
{
  static Scanner sc=new Scanner(System.in);
  int m1(float a)
  {
 	System.out.println(a);
	return m1(sc.nextInt());
  }
  int m1(int a)
  {
    System.out.println(super.m1(a));
    return a;
  }
  public static void main(String[]args)
  {
	System.out.println(new B().m1(sc.nextFloat()));
  }
}