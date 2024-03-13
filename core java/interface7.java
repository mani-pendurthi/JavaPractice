import java.util.Scanner;
interface A
{
  static Scanner sc=new Scanner(System.in);
  int m1(float a);
  float m2(int a);
  static boolean m3(char c)
  {
	System.out.println(c);
	return sc.nextBoolean();
  }
  static int m4(long d)
  {
	System.out.println(d);
	return sc.nextInt();
  }
}
class B implements A
{
  
  public int m1(float a)
  {
	System.out.println(a);
	return sc.nextInt();
  }
  public float m2(int a)
  {
	System.out.println(a);
	return sc.nextFloat();
  }
  public static void main(String[]args)
  {
	A obj=new B();
	obj.m1(sc.nextFloat());
	obj.m2(sc.nextInt());
	A.m3(sc.next().charAt(0));
	A.m4(sc.nextLong());
  }
}