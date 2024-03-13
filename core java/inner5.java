import java.util.Scanner;
interface I
{
    int m1(char b);
    float m2(short a);
}
class IA implements I
{
    static Scanner sc=new Scanner (System.in);
    public int m1(char b)
    {
        System.out.println(b);
        return sc.nextInt();
    }
    public float m2(short a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    public static void main(String[] args)
    {
       I obj=new I(){
           public int m1(char b)
           {
               System.out.println(b);
               return sc.nextInt();
           }
           public float m2(short a)
           {
               System.out.println(a);
               return sc.nextFloat();
           }
       };
       obj.m1(sc.next().charAt(0));
       obj.m2(sc.nextShort());
    }
}
