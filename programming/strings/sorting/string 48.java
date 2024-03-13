import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        String s[]=n.split(" ");
        int com=0;
        for(int i=0;i<s.length;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
                com=s[i].compareToIgnoreCase(s[j]);
                if(com>0)
                {
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(s));
    }
}
