import java.util.Scanner;

public class sample
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String t=s.replace(" ","");
        int ind=0;
        for(int i=0;i<t.length();i++)
        {
            if(ind==t.length())
            {
                break;
            }
            for(int j=0;j<=i;j++)
            {
                if(ind<t.length())
                {
                    System.out.print(t.charAt(ind++));
                }
            }
            System.out.println();
        }
    }
}