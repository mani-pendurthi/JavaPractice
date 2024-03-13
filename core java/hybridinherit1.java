import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  float b=sc.nextFloat();
  long c=sc.nextLong();
}
class B extends A
{
  int x=a+10;
  float y=b+5.5f;
  long z=c+5000;
}
class C extends B
{
  void display1()
  {
	System.out.println(x);
  }
}
class D extends B
{
  void display2()
  {
	System.out.print(y);
  }
}
class E extends B
{
  void display3()
  {
	System.out.println(z);
  }
}
class  test
{
  public static void main(String[]args)
  {
	C obj=new C();
  	obj.display1();
	D obj1=new D();
	obj1.display2();
	E obj2=new E();
	obj2.display3();
  }
}

