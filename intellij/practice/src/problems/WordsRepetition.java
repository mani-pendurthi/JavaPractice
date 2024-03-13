package problems;

import java.util.Arrays;
import java.util.Scanner;

public class WordsRepetition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String s1= sc.next();
        int c=0,c1=0,ind=0;
        boolean b=true;

        if(s.length()>s1.length())
        {
            String temp=s;
            s=s1;
            s1=temp;
        }
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            c=0;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                }
            }
            if(c==0)
            {
                c1=0;
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
                if(c1>=c)
                {
                    b=true;
                    //System.out.println(s.charAt(i));
                    //System.out.println(c1);
                    arr[ind++]=c1;
                }
                else
                {
                    b=false;
                    break;
                }
            }
        }
        Arrays.sort(arr);
        if(b)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=0)
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
