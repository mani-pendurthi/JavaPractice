import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        char c=sc.next().charAt(0);
        /*for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==c)
            {
                System.out.print(i);
                break;
            }
        }*/
        System.out.print(s.lastIndexOf(c));
    }
}