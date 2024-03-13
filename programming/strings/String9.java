import java.util.Scanner;
import java.util.Arrays;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        int n=sc.nextInt();
        for(int i=n;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}