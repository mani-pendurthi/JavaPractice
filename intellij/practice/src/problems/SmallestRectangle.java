package problems;

import java.util.Scanner;

public class SmallestRectangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        int c=0,w=0,b=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='_')
            {
                System.out.print('_');
                c++;
                w++;
            }
            else
            {
                System.out.println();
                for(int j=0;j<c;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("|");
                b++;
            }
        }
        System.out.println();
        System.out.print(w*b);
    }
}
