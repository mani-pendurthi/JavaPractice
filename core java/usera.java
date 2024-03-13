import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner (System.in);
  float f=sc.nextFloat();
}
class B
{
  static void m1()
  {
	A obj=new A();
	System.out.print("User A-"+obj.f);
  }
  public static void main(String[]args)
  {
	m1();
  }
}
