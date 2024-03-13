import java.util.Scanner;
import java.util.Arrays;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        System.out.print(Arrays.toString(ch));
        /*int n=s.length();
        char c[]=new char[n];
        for(int i=0;i<s.length();i++)
        {
            c[i]=s.charAt(i);
        }
        System.out.print(Arrays.toString(c));*/

    }
}