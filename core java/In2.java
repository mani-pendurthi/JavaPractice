package mainpackage.sub;
import java.util.Scanner;
public interface In2
{
  Scanner sc=new Scanner(System.in);
  float m7(int a);
  static char m8(String b)
  {
	System.out.println(b);
 	return sc.next().charAt(0);
  }
}