import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0;String s1="";
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            if(l<a[i].length())
            {
                l=a[i].length();
                s1=a[i];
            }
        }
        System.out.print(s1+"-"+l);
    }
}
