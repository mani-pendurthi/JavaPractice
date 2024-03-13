import java.util.Arrays;
import java.util.Scanner;

class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String s1=sc.nextLine();
        String s2=s+" "+s1;
        String s3[]=s2.split(" ");
        for(int i=0;i<s3.length;i++)
        {
            for(int j=i+1;j<s3.length;j++)
            {
                if(s3[i].compareToIgnoreCase(s3[j])>0)
                {
                    String temp=s3[i];
                    s3[i]=s3[j];
                    s3[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(s3));
    }
}