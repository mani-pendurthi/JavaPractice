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
        int z=0,w=0;
            for(int i=0;i<c.length();i++)
            {
                int x=c.codePointAt(i);
                int y=d.codePointAt(i);
                if(x!=y)
                {
                    if(x<y)
                    {
                        p.print(c);
                        w++;
                        break;
                    }
                    else
                    {
                        p.print(d);
                        w++;
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
            if(z==c.length() && w==0)
            {
                p.print(c);
            }
            else if(z==d.length() && w==0)
            {
                p.print(d);
            }
    }
}
