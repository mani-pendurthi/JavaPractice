import javax.sound.midi.SysexMessage;

interface A1
{
    static java.util.Scanner sc=new java.util.Scanner(System.in);
    int m1(float a);
}
interface A2
{
    float m2(int a);
}
interface A3
{
    char m3(String b);
}
class B5 implements A1,A2,A3
{
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
    public static void main(String[] args)
    {
        A1 obj1=new B5();
        A2 obj2=new B5();
        A3 obj3=new B5();
        obj1.m1(sc.nextFloat());
        obj2.m2(sc.nextInt());
        obj3.m3(sc.next());
    }
}


