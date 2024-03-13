import javax.sound.midi.SysexMessage;

interface A1
{
    static java.util.Scanner sc=new java.util.Scanner(System.in);
    int m1(float a);
}
interface A2 extends A1
{
    float m2(int a);
}
interface A3 extends A2
{
    char m3(String b);
    default double m4(long a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }

}
abstract class B4 implements A3
{
    B4(int a)
    {
        System.out.println(a);
    }
    abstract int m5(String b);
    void m6(char b)
    {
        System.out.println(b);
    }

}

class B5 extends B4
{
    B5()
    {
        super(sc.nextInt());
    }

    public int m1(float a)
    {
        System.out.print(a);
        return sc.nextInt();
    }
    public float m2(int a)
    {
        System.out.print(a);
        return sc.nextFloat();
    }
    public char m3(String a)
    {
        System.out.print(a);
        return sc.next().charAt(0);
    }
    int m5(String b)
    {
        System.out.println(b);
        return sc.nextInt();
    }

    public static void main(String[] args)
    {
        B4 obj=new B5();
        obj.m1(sc.nextFloat());
        obj.m2(sc.nextInt());
        obj.m3(sc.next());
        obj.m4(sc.nextLong());
        obj.m5(sc.next());
        obj.m6(sc.next().charAt(0));

    }
}


