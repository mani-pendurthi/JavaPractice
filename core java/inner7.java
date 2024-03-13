import java.util.Scanner;

interface In
{
    Scanner sc=new Scanner(System.in);
    default int m1(float a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    float m2(int b);
    interface In1
    {
        char m3(boolean c);
    }
    interface In2
    {
        boolean m4(char d);
    }
}
class Nested implements In
{
    public float m2(int b)
    {
        System.out.println(b);
        return sc.nextFloat();
    }
    public static void main(String[] args)
    {
        In obj=new In() {
            public float m2(int b)
            {
                System.out.println(b);
                return sc.nextFloat();
            }
        };
        obj.m1(sc.nextFloat());
        obj.m2(sc.nextInt());
        In.In1 obj2=new In.In1(){
            public char m3(boolean d)
            {
                System.out.println(d);
                return sc.next().charAt(0);
            }
        };
        obj2.m3(sc.nextBoolean());
        In.In2 obj3=new In.In2(){
            public boolean m4(char a)
            {
                System.out.println(a);
                return sc.nextBoolean();
            }

        };
        obj3.m4(sc.next().charAt(0));
    }
}
