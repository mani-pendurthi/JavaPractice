import java.util.Scanner;
class A
{
  static Scanner sc= new Scanner(System.in);
  boolean m1(String s)
  {
    return sc.nextBoolean();
  }
}
class B extends A
{
  boolean m1(String s)
  {
	System.out.println(super.m1(sc.next()));
    return sc.nextBoolean();
  }
}
class D extends B
{
  boolean m1(String s)
  {
	System.out.println(super.m1(sc.next()));
    return sc.nextBoolean();
  }
  public static void main(String []args)
  {
	System.out.println(new D().m1(sc.next()));
  }
}