package mainpackage;
import java.util.Scanner;
public interface In1
{
  Scanner sc=new Scanner(System.in);
  long m5(short a);
  static boolean m6(int a)
  {
      System.out.println(a);
	return sc.nextBoolean();
  }
}