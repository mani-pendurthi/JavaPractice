import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        int c=0,i=0;
        System.out.print(s.indexOf(s1));
        /*for(i=0;i<s.length();i++)
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
                System.out.println("Found at "+(i-s1.length())+" Index");
                break;
            }
        }
        if(i==s.length())
        {
            System.out.print("Not Found");
        }*/
    }
}
