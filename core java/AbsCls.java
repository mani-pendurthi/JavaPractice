package p3;
import java.util.Scanner;
public abstract class AbsCls
{
  public static Scanner sc=new Scanner(System.in);
  public AbsCls(int a)
  {
	System.out.println(a);
  }
  public abstract float m1(int a);
  public int m2(float b)
  {
	System.out.println(b);
	return sc.nextInt();
  }
  
}