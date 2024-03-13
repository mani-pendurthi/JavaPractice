import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String name=sc.next();
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        if(s.charAt(9)>=65 && s.charAt(9)<=91)
        {
            c3++;
        }
        for(int i=0;i<3;i++)
        {
            int a=(int)s.charAt(i);
            if(a>=65 && a<=91)
            {
                c1++;
            }
        }
        if(s.charAt(3)=='P' ||s.charAt(3)=='C' ||s.charAt(3)=='F' ||s.charAt(3)=='A' ||s.charAt(3)=='N' ||s.charAt(3)=='T')
        {
            c4++;
        }
        if(s.charAt(4)==name.charAt(0))
        {
            c5++;
        }
        for(int i=5;i<=8;i++)
        {
            if(s.charAt(i)>=49 && s.charAt(i)<=57)
            {
                c2++;
            }
        }
        if(c1==3 && c2==4 && c3==1 && c4==1 && c5==1)
        {
            System.out.print("Valid Pan Number");
        }
        else
        {
            System.out.print("Invalid Pan Number");
        }
    }
}
