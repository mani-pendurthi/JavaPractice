import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        char a[]=new char[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
            {
                c++;
            }
        }
        System.out.print(c);
    }
}