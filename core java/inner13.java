import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  int m1()
  {
	System.out.println("M1");
	return sc.nextInt();
  }
  public static void main(String[]args)
  { 
	A obj=new A(){
			int m1()
			{
			  System.out.print("Hello");
			  return sc.nextInt();
			}
			};
	obj.m1();
	A obj1=new A();
	obj1.m1();
	
  }
}