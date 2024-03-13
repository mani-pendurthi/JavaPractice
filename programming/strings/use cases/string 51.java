import java.util.Scanner;

class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String s1[]=s.split(" ");
        String t= sc.nextLine();
        String t1[]=t.split(" ");
        int c=0;
        for(int i=0;i<s1.length;i++)
        {
            c=0;
            for(int j=0;j<i;j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    c++;
                }
            }
            if(c==0)
            {
                for(int j=0;j<t1.length;j++)
                {
                    if(s1[i].equals(t1[j]))
                    {
                        System.out.print(s1[i]+" ");
                        break;
                    }
                }
            }
        }
    }
}