package mainpackage.sub;
import java.util.Scanner;
public interface In3
{
  Scanner sc=new Scanner(System.in);
  int m8(float a);
  static boolean m9(char b)
  {
	System.out.println(b);
 	return sc.nextBoolean();
  }
}