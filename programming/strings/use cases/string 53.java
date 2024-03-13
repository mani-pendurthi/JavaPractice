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

        int c=0;
        for(int i=0;i<s3.length;i++)
        {
            c=0;
            for(int j=0;j<i;j++)
            {
                if(s3[i].equals(s3[j]))
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print(s3[i]+" ");
            }
        }
    }
}