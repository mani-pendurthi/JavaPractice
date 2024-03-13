package p3;
import java.util.Scanner;
public class ConCls
{
  public static Scanner sc=new Scanner(System.in);
  public int  a=sc.nextInt();
  public ConCls()
  {
      this(sc.nextInt());
	System.out.println("DEF CONSTRUCTOR");
  }
  public ConCls(int a)
  {
	System.out.println(a);
  }
  public static int m1(float b)
  {
	System.out.println(b);
	return sc.nextInt();
  }
  
}