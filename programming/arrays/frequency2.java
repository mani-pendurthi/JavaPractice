import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                for(int k=i;k<n;k++)
                {
                    if(a[i]==a[k])
                    {
                        c++;
                    }
                }
                if(a[i]<10)
                {
                   System.out.println(a[i]+"------"+c); 
                }
                else
                {
                    System.out.println(a[i]+"-----"+c);
                }
                
            }
            
        }
    }
}