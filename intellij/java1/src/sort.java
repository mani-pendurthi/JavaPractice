import java.util.Scanner;

public class sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String s1="";String s2="";String s3="";
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {
                s1=ch+s1;
            }
        }

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {
                s2=s2+s1.charAt(index++);
            }
            else
            {
                s2=s2+s.charAt(i);
            }
        }
        System.out.print(s2);
    }
}
