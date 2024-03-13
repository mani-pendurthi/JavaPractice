import java.util.Scanner;
class Main
{

  public static void main(String[]args)
  {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char arr[]=new char[n];
	int c=0;
	for(int i=0;i<arr.length;i++)
	{
	  arr[i]=sc.next().charAt(0);
	}
	for(int i=0;i<arr.length;i++)
	{
	  if((arr[i]!='A' && arr[i]!='a')&& (arr[i]!='E' && arr[i]!='e')&& (arr[i]!='I' && arr[i]!='i') && (arr[i]!='O' && arr[i]!='o')&& (arr[i]!='U' && arr[i]!='u'))
	  {
		c++;
	  }
	}
	System.out.print(c);
  }
}