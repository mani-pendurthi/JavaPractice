import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /*char ch[]=new char[s.length()];
        String ns="";
        for(int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==',')
            {
                ch[i]=' ';
            }
            ns=ns+ch[i];
        }
        System.out.print(ns);*/
        System.out.print(s.replace(',',' '));
    }
}

