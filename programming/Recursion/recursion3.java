/*3.	Write a program to Print  the Multiplication table by 
using Recursion up to the given number?*/

import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        print(a,b);
    }
    static void print(int y,int z)
    {
        
        if(z>=1)
        {
            print(y,z-1);
            System.out.println(y+" * "+z+" = "+(y*z));
        }
    }
}