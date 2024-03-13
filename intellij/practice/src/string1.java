import java.util.Scanner;
public class string1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int n1=sc.nextInt();
        char str[]={'a','d','g','j','m','p','s','v','y'};
        char s1=str[n-1];
        char s2=str[n1-1];
        char e1=str[n-1];
        char e2=str[n1-1];
        if(n<9 && n1<9)
        {
            for(char i=s1;i<(char)(e1+3);i++)
            {
                for(char j=s2;j<(char)(e2+3);j++)
                {
                    System.out.println(i+""+j);
                }
            }
        }
        else if(n<9 && n1==9)
        {
            for(char i=s1;i<(char)(e1+3);i++)
            {
                for(char j=s2;j<(char)(e2+2);j++)
                {
                    System.out.println(i+""+j);
                }
            }
        }
        else if(n==9 && n1<9)
        {
            for(char i=s1;i<(char)(e1+2);i++)
            {
                for(char j=s2;j<(char)(e2+3);j++)
                {
                    System.out.println(i+""+j);
                }
            }
        }
        else
        {
            for(char i=s1;i<(char)(e1+2);i++)
            {
                for(char j=s2;j<(char)(e2+2);j++)
                {
                    System.out.println(i+""+j);
                }
            }
        }

    }
}