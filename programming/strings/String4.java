import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        int i=sc.nextInt();
        //System.out.print(s.codePointAt(i));
        int a=(int)s.charAt(i);
        System.out.print(a);
    }
}