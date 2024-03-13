package problems;

import java.util.Scanner;

public class LexicalSentence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String arr[]=s.split(" ");
        int lw=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length();j++)
            {
                int x=arr[i].codePointAt(j)-96;
                sum+=x;
            }
            lw+=sum*(i+1);
        }
        System.out.println(lw);
    }
}
