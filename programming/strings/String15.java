import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t[]=s.split("@",2);

        for(String i:t)
        {
            System.out.println(i+" ");
        }
    }
}

