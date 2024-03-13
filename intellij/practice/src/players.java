import java.util.Scanner;

public class players
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int p= sc.nextInt();
        int a[][]=new int[m][p];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<p;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        int max2=0,ind=0,player=0;
        for(int i=0;i<m;i++)
        {
            int max=0,sum=0;ind=0;
            for(int j=0;j<p;j++)
            {
                if(ind<m)
                {
                    sum+=a[ind++][i];
                }
                if(max<a[i][j])
                {
                    max=a[i][j];
                }
            }
            if(max2<sum)
            {
                max2=sum;
                player=i+1;
            }
            System.out.println("Player "+(i+1)+"- "+max);
        }
        System.out.println("Max score of a Player "+player+"- "+max2);
    }
}

