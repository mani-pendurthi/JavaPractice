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
    static void print(int x,int y)
    {
        if(x<=y)
        {
            print(x,y-1);
            System.out.print(y+" ");
        }
    }
}