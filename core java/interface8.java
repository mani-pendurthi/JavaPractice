import java.util.Scanner;
interface A
{
  static Scanner sc=new Scanner (System.in);
  int m1(int a);
  static float m2(float b)
  {
	System.out.println(b);
	return sc.nextFloat();
  }
}
abstract class B 
{
  static Scanner sc1=new Scanner (System.in);
  abstract float m3(int a);
  int m4(float b)
  {
	return sc1.nextInt();
  }
}
class C extends B implements A
{
  public int m1(int a)
  {
	System.out.println(a);
	return sc.nextInt();
  }
  float m3(int a)
  {
	System.out.println(a);
	return sc.nextFloat();
  }
  public static void main(String[]args)
  {
	B obj=new C();
	A obj1=new C();
	obj1.m1(sc.nextInt());
	A.m2(sc.nextFloat());
	obj.m3(sc.nextInt());
	obj.m4(sc.nextFloat());
	
  }
}