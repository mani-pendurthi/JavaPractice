import java.util.Scanner;
class A 
{
  int a=10;
}

class D extends A
{
  int a=20;
  void m1()
  {
	System.out.println("Without super="+a);
	System.out.println("With super="+super.a);
	}
  public static void main(String[]args)
  {
	new D().m1();
  }
}
