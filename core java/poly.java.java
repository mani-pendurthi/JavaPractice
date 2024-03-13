import java.util.Scanner;
class A
{
  public static void main(String[]args)
  {
	Scanner sc=new Scanner(System.in);
	m1(sc.nextInt());
     m1(sc.nextFloat()); //m1(5.6)------->Argument 
  }
  static int m1(int a)
  {
    System.out.println("M1 method");
    return 10;
  }
  static int m1(float b) //m1(float b)-----> parameter
  {
	System.out.println("M1 method");
    return 20;
  }
}