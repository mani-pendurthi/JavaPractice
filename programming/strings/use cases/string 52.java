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
            for(int j=0;j<s1.length;j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    c++;
                }
            }
            if(c==1)
            {
                for(int k=0;k<t1.length;k++)
                {
                    c=0;
                    for(int j=0;j<t1.length;j++)
                    {
                        if(t1[k].equals(t1[j]))
                        {
                            c++;
                        }
                    }
                    if(c==1)
                    {
                        if(s1[i].equals(t1[k]))
                        {
                            System.out.print(s1[i]+" ");
                        }
                    }
                }
            }
        }
    }
}