import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        String s[]=n.split(" ");
        int max=0,length=0;
        for(int i=0;i<s.length;i++)
        {
            length=s[i].length();
            if(max<length)
            {
                max=length;
            }
        }
        for(int i=max;i>0;i--)
        {
            for(int j=0;j<s.length;j++)
            {
                if(i==s[j].length())
                {
                    System.out.println(s[j]+" "+i);
                }
            }
        }
    }
}
