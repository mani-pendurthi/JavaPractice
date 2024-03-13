import java.util.Scanner;

class sample
{
    static Scanner sc=new Scanner(System.in);
    int m1(short a)
    {
        class localinner
        {
            int m1(float a)
            {
                System.out.println(a);
                return sc.nextInt();
            }
            static void m2(char c)
            {
                System.out.println(c);
            }
        }
        localinner obj1=new localinner();
        obj1.m1(sc.nextFloat());
        obj1.m2(sc.next().charAt(0));
        return sc.nextInt();
    }

    public static void main(String[] args)
    {
        sample obj=new sample();
        obj.m1(sc.nextShort());
    }
}
