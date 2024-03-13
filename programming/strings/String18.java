import java.util.Scanner;
class main
{
    static java.io.PrintStream p=System.out;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        String d= sc.next();
        p.print(c.equalsIgnoreCase(d));
    }
}