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
	int pal=0;
	if(a>0)
	{
	  
	  int rem=a%10;
	  int x=a/10;
	  System.out.print(display(rem));
	  rev(x); 
	}
	
  }
  static int display(int y)
  {
	int s=0;
	s=(s*10)+y;
	return s;
  }
}