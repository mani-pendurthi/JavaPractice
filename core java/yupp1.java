import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int x=0,c=0;
        
        for(int i=n;i>0;i--)
        {
            x=i;
            
            while(x>0)
            {
                int rem=x%10;
                    x/=10;
                    c=0;
                    if(rem==d)
                    {
                        c++;
                        break;
                    }
                    
            }
            if(c==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}