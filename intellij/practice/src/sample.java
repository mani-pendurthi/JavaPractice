import java.util.Scanner;
interface I1
{
    Scanner sc = new Scanner(System.in);
    void m1();
    static int m2()
    {
        System.out.println("M2");
        return sc.nextInt();
    }
}
interface I2
{
    Scanner sc = new Scanner(System.in);
    int m3();
    static double m4(float b)
    {
        System.out.println("M4");
        return sc.nextDouble();
    }

}
interface I3
{
    Scanner sc = new Scanner(System.in);
    int m5(char b);
    static int m6(float b)
    {
        System.out.println("M6");
        return sc.nextInt();
    }
}
abstract class a
{
    static Scanner sc = new Scanner(System.in);
    a(int a)
    {
        System.out.println(a);
    }

    abstract boolean m7(char b);
    char m8(float b)
    {
        System.out.println("M8");
        return sc.next().charAt(0);
    }
}
class b
{
    b(int a)
    {
        System.out.println(a);
    }
    void m9(float b)
    {
        System.out.println("M9");
    }
}
class c extends a implements I1,I2,I3
{
    c()
    {
        super(sc.nextInt());
    }
    static Scanner sc=new Scanner(System.in);
    static b obj=new b(sc.nextInt());
    boolean m7(char b)
    {
        System.out.println("M7");
        return a.sc.nextBoolean();
    }
    public void m1()
    {
        System.out.println("M1");
    }
    public int m3()
    {
        System.out.println("M3");
        return sc.nextInt();
    }
    public int m5(char b)
    {
        System.out.println("M5");
        return sc.nextInt();
    }
}

public class sample extends c
{
    public static void main(String[]args)
    {
        a obj=new c();
        obj.m7(sc.next().charAt(0));
        obj.m8(sc.nextFloat());
        c.obj.m9(sc.nextFloat());
        c obj1=new c();
        I1 obj2=(I1)obj1;
        obj2.m1();
        I1.m2();
        I2 obj3=(I2)obj1;
        obj3.m3();
        I2.m4(sc.nextFloat());
        I3 obj4=(I3)obj1;
        obj4.m5(sc.next().charAt(0));
        I3.m6(sc.nextFloat());
    }
}
