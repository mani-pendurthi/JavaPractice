import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max1=a[0],max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(max1<a[i])
            {
                max3=max2;
                max2=max1;
                max1=a[i];
            }
            else if(max2<a[i] && max1!=a[i])
            {
                max3=max2;
                max2=a[i];
            }
            else if(max3<a[i] && max2!=a[i])
            {
                max3=a[i];
            }
        }
        System.out.print(max1+" ");
        System.out.print(max2+" ");
        System.out.p