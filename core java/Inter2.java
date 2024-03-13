package p3;
import java.util.Scanner;
public interface Inter2
{
  Scanner sc=new Scanner(System.in);
  int m3(boolean b);
  static int m4(float a)
  {
	System.out.println(a);
 	return sc.nextInt();
  }
}