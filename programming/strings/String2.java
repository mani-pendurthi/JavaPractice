import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        int lc=0,uc=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                lc++;
                if(lc%2==1)
                {
                    System.out.print(s.charAt(i)+" ");
                }
            }
            else if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                uc++;
                if(uc%2==1)
                {
                    System.out.print(s.charAt(i)+" ");
                }
            }
        }
    }
}