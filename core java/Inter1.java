package p3;
import java.util.Scanner;
public interface Inter1
{
  Scanner sc=new Scanner(System.in);
  int m1(char c);
  static char m2(int a)
  {
	System.out.println(a);
 	return sc.next().charAt(0);
  }
}