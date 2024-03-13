import java.util.Scanner;
class A
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  
}
class B extends A
{
  void display()
  {
	System.out.println("Class B");
	System.out.println(a);
	System.out.println(b);
  }
  
}
class C extends A
{
  void display1()
  {
	System.out.println("Class c");
	System.out.println(a);
	System.out.println(b);
  }
  
}
class D extends C
{
  void display2()
  {
	System.out.println("Class D");
	System.out.println(a);
	System.out.println(b);
  }
}
class test
{
  public static void main(String [] args)
  {
	D obj=new D();
	obj.display2();

	C obj1=new C();
	obj1.display1();

	B obj2=new B();
	obj2.display();
  }
}
