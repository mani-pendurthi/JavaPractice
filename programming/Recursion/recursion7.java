import java.util.Scanner;
class Main
{
  public static void main(String[]args)
  {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	rev(n);
  }
  static void rev(int a)
  {
	if(a>0)
	{
	  int rem=a%10;
	  System.out.print(rem);
	  int x=a/10;
	  rev(x);
	}
  }
}