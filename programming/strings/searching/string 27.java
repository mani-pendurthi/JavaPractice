import java.util.Scanner;
class sample
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                System.out.println(ch+" "+i);
            }
        }
    }
}
