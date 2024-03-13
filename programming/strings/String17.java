import java.util.Scanner;
class main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String a=new String("java");
        String b=new String("java");
        String c=sc.next();
        String d=sc.next();
        
        /*System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(c==d);*/
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c.equals(d));
    }
}