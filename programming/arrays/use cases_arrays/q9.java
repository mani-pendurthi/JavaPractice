import java.util.Scanner;
class Main
{
  public static void main(String[]args)
  {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];

	for(int i=0;i<n;i++)
	{
	  a[i]=sc.nextInt();
	}
	int b[]=new int[n+1];
     for(int i=0;i<n;i++)
	{
	  b[i]=a[i];
    }
	b[n]=sc.nextInt();
     
     a=b;
	for(int i=0;i<a.length;i++)
	{
	  System.out.print(a[i]+" ");
	}
  }
}