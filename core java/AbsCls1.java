package mainpackage;
import java.util.Scanner;
public abstract class AbsCls1
{
  static Scanner sc=new Scanner (System.in);
  public AbsCls1(int a)
  {
    System.out.println(a);
  }
  public abstract String m3(char a);
  public float m4(int a)
  {
	System.out.println(a);
      return sc.nextFloat();
  }
}