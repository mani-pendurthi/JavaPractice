package problems;

import java.util.Scanner;

public class LexicalWeight
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String in= sc.next();
        String in2= sc.next();
        int sum1=0,sum2=0;
        for(int i=0;i<in.length();i++)
        {
            int x=in.codePointAt(i)-96;
            sum1+=(i+1)*x;
        }
        for(int i=0;i<in2.length();i++)
        {
            int x=in2.codePointAt(i)-96;
            sum2+=(i+1)*x;
        }
        if(sum1>sum2)
        {
            System.out.println(in+"-"+sum1);
        }
        else
        {
            System.out.println(in2+"-"+sum2);
        }
    }
}
