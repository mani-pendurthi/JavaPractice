import java.util.Scanner;

class sample
{
    static Scanner sc=new Scanner(System.in);
    int m1(float a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    class inner
    {
        float m2(char c)
        {
            class localinner1
            {
                char m3(boolean b)
                {
                    System.out.println(b);
                    return sc.next().charAt(0);
                }
            }
            class localinner2
            {
                boolean m4(long a)
                {
                    System.out.print(a);
                    return sc.nextBoolean();
                }
            }
            localinner1 in1=new localinner1();
            localinner2 in2=new localinner2();
            in1.m3(sc.nextBoolean());
            in2.m4(sc.nextLong());
            return sc.nextFloat();
        }
    }
    public static void main(String[] args)
    {
        sample obj=new sample();
        obj.m1(sc.nextFloat());
        sample.inner inobj=obj.new inner();
        inobj.m2(sc.next().charAt(0));
    }
}
