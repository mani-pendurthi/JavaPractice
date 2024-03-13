import java.util.Scanner;
class sample
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' &&ch<='z')
            {
                c1++;
                if(c1%2==1)
                {
                    System.out.print((char)(ch-32));
                }
                else
                {
                    System.out.print(ch);
                }
            }
            else if(ch>='A' && ch<='Z')
            {
                c2++;
                if(c2%2==1)
                {
                    System.out.print((char)(ch+32));
                }
                else
                {
                    System.out.print(ch);
                }
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}
