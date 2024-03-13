import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  static int a=sc.nextInt();
}
class B extends A
{
  public static void main(String[]args)
  {
	System.out.print(a);
  }
}