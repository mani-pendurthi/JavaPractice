package p4;
import java.util.Scanner;
import p3.*;
public class Run extends AbsCls implements Inter1,Inter2
{
  static Scanner sc=new Scanner(System.in);
  Run()
  {
    super(sc.nextInt());
  }
  public float m1(int a)
  {
	System.out.println(a);
	return sc.nextFloat();
  }
  public int m1(char c)
  {
	System.out.println(c);
	return sc.nextInt();
  }
  public int m3(boolean b)
  {
	System.out.println(b);
	return sc.nextInt();
  }
  public static void main(String[]args)
  {
	
	AbsCls obj=new Run();
	System.out.print(obj.m2(sc.nextFloat()));
	System.out.print(obj.m1(sc.nextInt()));
	ConCls obj1=new ConCls();
	System.out.print(obj1.a);
	System.out.println(ConCls.m1(sc.nextFloat()));
	Inter1 obj2=new Run();
	System.out.println(obj2.m1(sc.next().charAt(0)));
	System.out.println(Inter1.m2(sc.nextInt()));
	Inter2 obj3=new Run();
	System.out.println(obj3.m3(sc.nextBoolean()));
	System.out.println(Inter2.m4(sc.nextFloat()));
  }
}