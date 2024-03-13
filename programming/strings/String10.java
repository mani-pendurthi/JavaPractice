import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String str=sc.next();
        int s=sc.nextInt();
        int e=sc.nextInt();
        for(int i=s;i<=e;i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}