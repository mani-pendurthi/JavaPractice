package problems;
import java.util.Scanner;
public class PrimeFebinocciTriangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c=0,p=2,fc=0,a=0,b=1,d=0;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;)
            {
                c++;
                if(c%2==1)
                {
                    for(int k=p;;k++)
                    {
                        fc=0;
                        for(int l=2;l<k;l++)
                        {
                            if(k%l==0)
                            {
                                fc++;
                            }
                        }
                        if(fc==0 )
                        {
                            System.out.print(k+" ");
                            p=k+1;
                            j++;
                            break;
                        }

                    }
                }
                else {
                        System.out.print(a+" ");
                        d=a+b;
                        a=b;
                        b=d;
                        j++;
                }
            }
            System.out.println();
        }
    }
}
