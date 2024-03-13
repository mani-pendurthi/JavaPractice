import java.util.Scanner;
interface A1
{
    Scanner sc=new Scanner(System.in);
   int m1(float a);
   void m2(int a);
   static float m3(char b)
   {
       System.out.print(b);
       return sc.nextFloat();
   }
}
class New implements A1
{
    public int m1(float a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    public void m2(int a)
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        A1 obj=new New();
        obj.m1(sc.nextFloat());
        obj.m2(sc.nextInt());
        A1.m3(sc.next().charAt(0));
    }
}