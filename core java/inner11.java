import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  int m1(float b)
  {
	System.out.println("M1");
	return sc.nextInt();
  }
  static class B
  {
	float m2(int a)
	{
	  System.out.println("M2");
	  return sc.nextFloat();
      }
  }
  public static void main(String[]args)
  { 
	A obj=new A();
	B obj1=new B();
      obj.m1(sc.nextFloat());
	obj1.m2(sc.nextInt());
  }
}