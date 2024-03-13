import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.print(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.print("Something went wrong");
        }

    }
}