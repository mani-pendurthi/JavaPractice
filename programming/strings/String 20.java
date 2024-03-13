import java.util.Locale;
import java.util.Scanner;
class main
{
    static java.io.PrintStream p=System.out;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        String d= sc.next();
        String a=c.toLowerCase();
        String b=d.toLowerCase();
        int z=0;
            for(int i=0;i<c.length();i++)
            {
                int x=a.codePointAt(i);
                int y=b.codePointAt(i);
                if(x!=y)
                {
                    if(x<y)
                    {
                        p.print(c);
                        break;
                    }
                    else
                    {
                        p.print(d);
                        break;
                    }
                }
                else
                {
                    z++;
                }
                if(z==c.length() || z==d.length())
                {
                    break;
                }
            }
            if(z==c.length())
            {
                p.print(c);
            }
            else
            {
                p.print(d);
            }
    }
}
