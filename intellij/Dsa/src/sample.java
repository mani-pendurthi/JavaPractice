import java.util.ArrayList;
import java.util.Scanner;
public class sample
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int c=0,max=0,ind=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(max<c)
            {
                max=c;
            }
        }
        for(int i=max;i>=0;i--)
        {
                System.out.println("Hello");
        }
        /*int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> obj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> al=new ArrayList<>();
            int ele= sc.nextInt();
            for(int j=0;j<ele;j++)
            {
                al.add(sc.nextInt());
            }
            obj.add(al);
        }
        int r= sc.nextInt();
        int c= sc.nextInt();

        System.out.println(obj.get(r-1).get(c-1));*/
    }
}
