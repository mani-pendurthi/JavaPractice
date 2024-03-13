import java.util.Arrays;
import java.util.Scanner;

class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String s1=s.replace(" ","");
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print(s1.charAt(c)+" ");
                c++;
            }
            if(c==s1.length()-1)
            {
                break;
            }
            System.out.println();
        }
    }
}