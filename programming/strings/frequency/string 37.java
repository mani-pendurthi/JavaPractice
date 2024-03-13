import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        /*String elements="";
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                c++;
            }
        }
        String arr[]=new String[c];
        int e=0,st=0;c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                e=i;elements="";
                for(int j=st;j<e;j++)
                {
                    elements=elements+s.charAt(j);
                }
                st=i+1;
                arr[c++]=elements;                  //Split method logic
            }
        }
        System.out.print(Arrays.toString(arr));*/
        String s1[]=s.split(" ");
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
                for(int j=0;j<s1.length;j++)
                {
                    if(s1[i].equals(s1[j]))
                    {
                        c++;
                    }
                }
                System.out.println(s1[i]+"--"+c);
            }
        }
    }
}
