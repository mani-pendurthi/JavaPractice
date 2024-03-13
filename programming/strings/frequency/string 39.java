import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int c=0,wc=0,cc=0,max1=0,max2=0;
        for(int i=0;i<s1.length;i++)
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
                wc=0;cc=0;
                for(int j=0;j<s1.length;j++)
                {
                    if(s1[i].equals(s1[j]) && s1[i].length()>1)
                    {
                        wc++;
                    }
                    if(s1[i].equals(s1[j]) && s1[i].length()==1)
                    {
                        cc++;
                    }
                }
                if(max1<wc)
                {
                    max1=wc;
                }
                if(max2<cc)
                {
                    max2=cc;
                }
            }

        }
        for(int i=0;i<s1.length;i++)
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
                wc=0;cc=0;
                for(int j=0;j<s1.length;j++)
                {
                    if(s1[i].equals(s1[j]) && s1[i].length()>1)
                    {
                        wc++;
                    }
                    if(s1[i].equals(s1[j]) && s1[i].length()==1)
                    {
                        cc++;
                    }
                }
                if(max1==wc)
                {
                    System.out.println(s1[i]+" "+wc);
                }
                if(max2==cc)
                {
                    System.out.print(s1[i]+" "+cc);
                }
            }
        }
    }
}
