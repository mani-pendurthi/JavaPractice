import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int c=0,max=0;
        for(int i=0;i< s1.length;i++)
        {
            c=0;
            for(int j=0;j<i;j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    c++;
                }
            }
            if(c==0)
            {
                for(int j=0;j<s1.length;j++)
                {
                    if(s1[i].equals(s1[j]) && s1[i].length()>1)
                    {
                        c++;
                    }
                }
                if(s1[i].length()>1)
                {
                    System.out.println(s1[i]+" "+c);
                }
            }
        }
    }
}
