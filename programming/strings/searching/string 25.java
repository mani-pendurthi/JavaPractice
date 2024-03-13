import java.util.Scanner;
class sample
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String s1=sc.next();
        int c=0;
        System.out.print(s.contains(s1));
        /*for(int i=0;i<s.length();i++)
        {
            c=0;
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(j)==s.charAt(i))
                {
                    c++;
                    i++;
                }
            }
            if(c==s1.length())
            {
                System.out.print((i-s1.length())+" ");
                break;
            }
        }*/
    }
}
