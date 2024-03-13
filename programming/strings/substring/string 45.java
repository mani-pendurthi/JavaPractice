import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
        }
    }
}
