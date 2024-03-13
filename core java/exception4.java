import java.util.InputMismatchException;
import java.util.Scanner;

public class sample {
    int m1(int a, int b)
    {
        int ans=0;
        try{
            ans=a/b;
        }
        catch(ArithmeticException y)
        {
            System.out.print("Invalid operation");
        }
        return ans;
    }
    void m2(float a)
    {
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        sample obj=new sample();
        try
        {
            int a= sc.nextInt();
            int b=sc.nextInt();
            float c= sc.nextFloat();
            obj.m1(a,b);
		obj.m2(c);
        }
        catch(InputMismatchException x)
        {
            System.out.print("Invalid Input Entered");
        }

    }
}