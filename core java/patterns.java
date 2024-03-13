import java.util.Scanner;
class Main
{

  public static void main(String[]args)
  {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	
	for(int i=1;i<=r;i++)
	{
	  for(int j=r-1;j>=i;j--)
	  {
	    System.out.print(" ");
	  }
	  for(int s=1;s<=i;s++)
	  {
		System.out.print("* ");
	  }
	  System.out.println("");
	}

  }
}