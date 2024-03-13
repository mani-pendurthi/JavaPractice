import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[]=new int[r];
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.print("Element not found");
        }
        else
        {
            System.out.print("Element found");
        }
    }
}