/*Create java where we need to satisy this keyword at method , constructor and variable level.*/

import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);

  float a=sc.nextFloat();

  A()
  {
	this(sc.nextInt());
  }
  A(int y)
  {
	System.out.print(y);
  }
  void m1(Boolean x)
  {
	int a=sc.nextInt();
	this.m2(sc.next().charAt(0));
	System.out.println(this.a);
  }
  void m2(char d)
  {
	System.out.println("Hello");
  }
  public static void main(String []args)
  {
	A obj=new A();
	obj.m1(sc.nextBoolean());
  }
}