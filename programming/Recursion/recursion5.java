import java.util.Scanner;
class Main
{
    static int a=0;
    static int b=1;
    static int c=0;
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        Feb(n);

    }
    static void Feb(int n)
    {
        if(n>0)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            Feb(--n);
        }
    }
}