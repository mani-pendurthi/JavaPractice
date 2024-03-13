import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        char c[]=n.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]>c[j])
                {
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(c));
    }
}
