import java.util.Scanner;
class A
{
  static Scanner sc= new Scanner(System.in);
  A()
  {
	System.out.println("A DEF");
  }
}
class B extends A
{
  B(float b)
  {
	super();
	System.out.println("B PARA");
  }  
}
class C extends B
{
  C(int a)
  {
    super(sc.nextFloat());
	System.out.println("C PARA");
  }
}
class D extends C
{
  D()
  {
	super(sc.nextInt());
	System.out.println("D DEF");
  }
  public static void main(String []args)
  {
	new D();
  }
}