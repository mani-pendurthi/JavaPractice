import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        int in= sc.nextInt();
        String s[]=n.split(" ");
        int c=0;
        for(int i=0;i<s.length;i++)
        {
            c=0;
            for(int j=0;j<i;j++)
            {
                if(s[i].equals(s[j]))
                {
                    c++;
                }
            }
            if(c==0)
            {
                for(int j=0;j<s.length;j++)
                {
                    if(s[i].equals(s[j]))
                    {
                        c++;
                    }
                }
                if(c==in)
                {
                    System.out.println(s[i]);
                }
            }
        }
    }
}
