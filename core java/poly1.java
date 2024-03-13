import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  int m1(int a)
  {
    return a;
  }
  float m2(float b)
  {
    return b;
  }
}
class B extends A
{
  int m1(int a)
  {
    System.out.println(super.m1(a));
    return a;
  }
  float m2(float b)
  {
    System.out.println(super.m2(b));
    return b;
  }
  public static void main(String[]args)
  {
    B obj=new B();
    System.out.println(obj.m1(sc.nextInt()));
    System.out.println(obj.m2(sc.nextFloat()));
  }
}