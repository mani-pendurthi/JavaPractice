import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String New[]=s.split(" ");
        for(int i=0;i<New.length;i++)
        {
            for(int j=New[i].length()-1;j>=0;j--)
            {
                System.out.print(New[i].charAt(j));
            }
            System.out.print(" ");
        }

    }
}
