import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int k=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<k)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}