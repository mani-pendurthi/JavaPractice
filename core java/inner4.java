import java.util.Scanner;
class inner
{
    static Scanner sc=new Scanner(System.in);

    static class InnerStatic
    {
        float m2(boolean b)
        {
            System.out.println(b);
            return sc.nextFloat();
        }
    }
    boolean m1(int a)
    {
        System.out.println(a);
        return sc.nextBoolean();
    }
    public static void main(String[] args)
    {
        inner obj=new inner();
        System.out.println(obj.m1(sc.nextInt()));
        inner.InnerStatic obj1=new InnerStatic();
        System.out.println(obj1.m2(sc.nextBoolean()));
    }
}

