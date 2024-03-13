import java.util.Scanner;
interface A
{
  void m1(int a);
  void m2(float b);
}
class B implements A
{
  static Scanner sc=new Scanner(System.in);
  public void m1(int a)
  {
	System.out.println(a);
  }
  public void m2(float b)
  {
	System.out.println(b);
  }
  public static void main(String[]args)
  {
	A obj=new B();
	obj.m1(sc.nextInt());
	obj.m2(sc.nextFloat());
	
  }
}
