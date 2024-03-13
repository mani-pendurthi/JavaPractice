import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String lc=s.toLowerCase();
        int c=0;
        for(int i=0;i<lc.length();i++)
        {
            c=0;
            for(int j=0;j<i;j++)
            {
                if(lc.charAt(i)==lc.charAt(j))
                {
                    c++;
                }
            }
            if(c==0)
            {
                for(int j=0;j<lc.length();j++)
                {
                    if(lc.charAt(i)==lc.charAt(j))         //ignore case
                    {
                        c++;
                    }
                }
                System.out.println(lc.charAt(i)+"-"+c);
            }
        }
        /*for(int i=0;i<s.length();i++)
        {
            c=0;
            for(int j=0;j<i;j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    c++;
                }
            }
                if(c==0)
                {
                    for(int j=0;j<s.length();j++)
                    {
                        if(s.charAt(i)==s.charAt(j))        //case sensitive
                        {
                            c++;
                        }
                    }
                    System.out.println(s.charAt(i)+"-"+c);
                }
        }*/
    }
}
