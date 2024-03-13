import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
}
class B 
{
  static A obj=new A(); 	
  public static void main(String[]args)
  {
	System.out.print("Has A-"+obj.a);
  }
}