package problems;

import java.util.Scanner;

public class StringComparision
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1= sc.next();
        s=s.toLowerCase();
        s1=s1.toLowerCase();
        int c=0,c1=0,finalcount=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {
                c++;
            }
        }
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if((ch>='a'&&ch<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
            {
                c1++;
            }
        }
        if(c==s.length() && c1==s1.length())
        {
            if(s.length()>s1.length())
            {
                String temp=s;
                s=s1;
                s1=temp;
            }
            c=0;c1=0;
            for(int i=0;i<s.length();i++)
            {
                c=0;c1=0;
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        c++;
                    }
                }
                for(int j=0;j<s1.length();j++)
                {
                    if(s.charAt(i)==s1.charAt(j))
                    {
                        c1++;
                    }
                }
                if(c<=c1 && c!=0)
                {
                    finalcount++;
                }
            }
            if(finalcount==s.length())
            {
                System.out.print("Yes");
            }
            else
            {
                System.out.print("No");
            }
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}
