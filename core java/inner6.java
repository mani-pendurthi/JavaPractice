import java.util.Scanner;
abstract class sample
{
    sample(int a)
    {
        System.out.println(a);
    }
    static Scanner sc=new Scanner(System.in);
    abstract int m1(float a);
    boolean m2(String b)
    {
        System.out.println(b);
        return sc.nextBoolean();
    }
    interface In
    {
        void m3(char d);
        default String m4(float e)
        {
            System.out.println(e);
            return sc.next();
        }
    }

    public static void main(String[] args)
    {
        sample obj=new sample(sc.nextInt()){
            int m1(float a)
            {
                System.out.println(a);
                return sc.nextInt();
            }

        };
        obj.m1(sc.nextFloat());
        In obj2=new In()
        {
            public void m3(char d)
            {
                System.out.println(d);
            }
        };
        obj2.m3(sc.next().charAt(0));
        obj.m2(sc.next());
        obj2.m4(sc.nextFloat());

    }
}
