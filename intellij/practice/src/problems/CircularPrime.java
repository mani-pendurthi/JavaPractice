package problems;
import java.util.Scanner;
public class CircularPrime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String s=""+n;
        int t=n;
        boolean b=false;
        for(int i=1;i<s.length();i++)
        {
            int r=t%10;
            t/=10;
            if(n<100)
            {
                t=(r*10)+t;
            }
            else if(n<1000)
            {
                t=(r*100)+t;
            }
            else if(n<10000)
            {
                t=(r*1000)+t;
            }
            else if(n<100000)
            {
                t=(r*10000)+t;
            }
            else if(n<100000)
            {
                t=(r*10000)+t;
            }
            System.out.println(t);
            int fc=0;
            for(int j=2;j<t;j++)
            {
                if(t%j==0)
                {
                    fc++;
                }
            }
            if(fc==0)
            {
                b=true;
            }
            else
            {
                b=false;
                break;
            }
        }
        if(b)
        {
            System.out.println("Circular Prime");
        }
        else
        {
            System.out.println("Not a circular Prime");
        }
    }
}
