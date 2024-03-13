package problems;
import java.util.Scanner;
import java.util.Arrays;
public class GroupOfSamples
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        int arr1[]=new int[n];
        int c=0,sum=0,max=0;
        char maxi='1';
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next().charAt(0);
            arr1[i]=sc.nextInt();
        }
        System.out.println("Select options below"+"\n"+"1.Sum of samples     2.Max of samples");
        int option= sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            c=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                sum=0;
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        sum+=arr1[j];
                    }
                }
                if(max<sum)
                {
                    max=sum;
                    maxi=arr[i];
                }
                if(option==1)
                {
                    System.out.print(arr[i]+"---"+sum+"\n");
                }
            }
        }
        if(option==2)
        {
            System.out.println(maxi+"-"+max);
        }
    }
}

