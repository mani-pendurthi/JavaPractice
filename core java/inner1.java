import java.util.Scanner;

class sample
{
    static Scanner sc=new Scanner(System.in);
    private String password=sc.next();
    class inner1
    {
        void m1(boolean b)
        {
            System.out.println(b);
            System.out.println(password);
        }
    }
    class inner2
    {
        int m1(char c)
        {
            System.out.println(c);
            System.out.println(password);
            return sc.nextInt();
        }

    }
    int m1(float b)
    {
        System.out.println(b);
        return sc.nextInt();
    }

    public static void main(String[] args)
    {
        sample obj=new sample();
        sample.inner1 inner1obj=obj.new inner1();
        sample.inner2 inner2obj=obj.new inner2();
        obj.m1(sc.nextFloat());
        inner1obj.m1(sc.nextBoolean());
        inner2obj.m1(sc.next().charAt(0));
    }
}
