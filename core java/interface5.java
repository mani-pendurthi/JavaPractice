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

abstract class B4 implements A2
{
    B4(int a)
    {
        System.out.println(a);
    }
    abstract int m3(float a);
    float m4(int b)
    {
        System.out.println(b);
        return sc.nextFloat();
    }
}

class B5 extends B4
{
    B5()
    {
        super(sc.nextInt());
    }
    int m3(float a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    public int m1(float b)
    {
       System.out.println(b);
       return sc.nextInt();
    }
    public float m2(int b)
    {
        System.out.println(b);
        return sc.nextFloat();
    }

    public static void main(String[] args)
    {
        B4 obj=new B5();
        obj.m1(sc.nextFloat());
        obj.m2(sc.nextInt());
        obj.m3(sc.nextFloat());
        obj.m4(sc.nextInt());
    }
}


