import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        char ch=sc.next().charAt(0);
        alpha(ch);

    }
    static void alpha(char a)
    {
        if(a>='A' && a<='Z')
        {
            System.out.print(a+" ");
            alpha(++a);
        }
        else if(a>='a' && a<='z')
        {
            System.out.print(a+" ");
            alpha(++a);
        }
    }
}