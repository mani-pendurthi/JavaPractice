import java.util.*;
class A
{

public static void main(String []args)
{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter initial value-");
		int a =obj.nextInt();
		System.out.print("Enter upto value-");
		int b =obj.nextInt();
		
		int i=a;
		do
		{
			if(i%4==0)
			{
				System.out.print(i+" ");
			}i++;.
		}while(i<=b);		
	
}

}