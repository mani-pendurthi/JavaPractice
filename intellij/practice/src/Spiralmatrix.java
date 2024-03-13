import java.util.Scanner;

public class Spiralmatrix
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][]=new int[n][n];
        int r1=0,r2=n-1,c1=0,c2=n-1,c=1;
        while(r1<=r2 && c1<=c2)
        {
            for(int i=c1;i<=c2;i++)
            {
                arr[r1][i]=c++;
            }
            r1++;
            for(int i=r1;i<=r2;i++)
            {
                arr[i][c2]=c++;
            }
            c2--;
            for(int i=c2;i>=c1;i--)
            {
                arr[r2][i]=c++;
            }
            r2--;
            for(int i=r2;i>=r1;i--)
            {
                arr[i][c1]=c++;
            }
            c1++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]<10)
                {
                    System.out.print("0"+arr[i][j]+" ");
                }
                else
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}
