import java.util.Scanner;

abstract class A
{
  static Scanner sc=new Scanner(System.in);
  A(float a)
  {
	System.out.println(a);
  }
  abstract int m1(int a,int b);
  abstract int m2(int a,int b);
  abstract int m3(int a,int b);
}
class B extends A
{
  B()
  {
	super(sc.nextFloat());
  }
  int m1(int a,int b)
  {
  	return a+b;
  }
  int m2(int a,int b)
  {
	return a+b;
  }
  int m3(int a,int b)
  {
	return a+b;
  }
    
}
class C extends A
{
  C()
  {
	super(sc.nextFloat());
  }
  int m1(int a,int b)
  {
  	return a-b;
  }
  int m2(int a,int b)
  {
	return a-b;
  }
  int m3(int a,int b)
  {
	return a-b;
  }
}
class D extends A
{
  D()
  {
	super(sc.nextFloat());
  }
  int m1(int a,int b)
  {
  	return a*b;
  }
  int m2(int a,int b)
  {
	return a*b;
  }
  int m3(int a,int b)
  {
	return a*b;
  }
}
class test
{

  static Scanner sc=new Scanner(System.in);
  A display(A obj)
  {
	System.out.println(obj.m1(sc.nextInt(),sc.nextInt()));
	System.out.println(obj.m2(sc.nextInt(),sc.nextInt()));
	System.out.println(obj.m3(sc.nextInt(),sc.nextInt()));

	return obj;
  }
  public static void main(String[]args)
  {
	test obj=new test();
	char c=sc.next().charAt(0);
	
	switch(c)
	{
	case '+':A obj1=new B();
	System.out.print(obj.display(obj1));
	break;
	case '-':A obj2=new C();
	System.out.print(obj.display(obj2));
	break;
	case '*':A obj3=new D();
	System.out.print(obj.display(obj3));
	break;
	default:System.out.print("Invlaid input");
	}
  }
}
