import java.util.Scanner;
abstract class ABS
{
    abstract int m1(char a);
    void m2()
    {
        System.out.println("M2");
    }

}

class outer
{
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        ABS obj=new ABS() {
            int m1(char a)
            {
                System.out.println("Over riding Method");
                return sc.nextInt();
            }

        };
        obj.m1(sc.next().charAt(0));
        obj.m2();
    }

}