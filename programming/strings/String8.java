import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        /*for(int i=0;i<s.length();i++)
        {
            int a=(int)s.charAt(i);
            if(a>=65 && a<=90)
            {
                a+=32;              //toLowerCase
                char c=(char)a;
                System.out.print(c);
            }
            else
            {
                System.out.print(s.charAt(i));
            }
        }*/
        /*for(int i=0;i<s.length();i++)
        {
            int a=(int)s.charAt(i);
            if(a>=97 && a<=122)
            {
                a-=32;                    //toUpperCase
                char c=(char)a;
                System.out.print(c);
            }
            else
            {
                System.out.print(s.charAt(i));
            }
        }*/
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}