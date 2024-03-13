package problems;

import java.util.Scanner;

public class ValidParanthesis
{
    public static void main(String args[])
    {
        //Write your code here.
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;

        if((s.charAt(0)=='(' && s.charAt(1)==')') ||
                (s.charAt(0)=='[' && s.charAt(1)==']') || (s.charAt(0)=='{' && s.charAt(1)=='}'))
        {
            for(int i=0;i<s.length();i+=2)
            {
                if(s.charAt(i)=='(' && s.charAt(i+1)==')')
                {
                    c++;
                }
                else if(s.charAt(i)=='[' && s.charAt(i+1)==']')
                {
                    c++;
                }
                else if(s.charAt(i)=='{' && s.charAt(i+1)=='}')
                {
                    c++;
                }
            }
            if(c==s.length()/2)
            {
                System.out.print("Valid");
            }
            else
            {
                System.out.print("Not valid");
            }
        }
        else
        {
            String x="";
            String y="";
            int ind=0,c1=0;
            for(int i=0;i<s.length()/2;i++)
            {
                x+=s.charAt(i);
            }
            for(int j=s.length()-1;j>=s.length()/2;j--)
            {
                y+=s.charAt(j);
            }
            System.out.println(x);
            System.out.println(y);
            for(int i=0;i<s.length()/2;i++)
            {
                if(x.charAt(i)=='(' && y.charAt(i)==')')
                {
                    c1++;
                }
                else if(x.charAt(i)=='{' && y.charAt(i)=='}')
                {
                    c1++;
                }
                else if(x.charAt(i)=='[' && y.charAt(i)==']')
                {
                    c1++;
                }
            }
            if(s.length()%2==1)
            {
                c1--;
            }
            if(c1==s.length()/2)
            {
                System.out.print("Valid");
            }
            else
            {
                System.out.print("Not valid");
            }
        }

    }
}
