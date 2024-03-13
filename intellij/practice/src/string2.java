import java.util.Scanner;

public class string2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0,t=n;String n1="";

        //while(t>0)
        //{
            for(int i=1;i<=t;i++)
            {
                for(int j=i;j<=t;j++)
                {
                    sum=0;n1="";
                    while(sum<=n)
                    {
                        sum=sum+(i+j);
                        n1=n1+i+j;
                        if(sum==n)
                        {
                            System.out.println(n1);
                        }
                        else if (sum>n)
                        {
                            break;
                        }
                    }
                }

            }
            //t--;
        //}

    }
}
