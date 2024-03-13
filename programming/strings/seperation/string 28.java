import java.util.Scanner;
class sample
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!(ch>='a' &&ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
