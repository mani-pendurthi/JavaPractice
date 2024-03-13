import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        char a[]=new char[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}