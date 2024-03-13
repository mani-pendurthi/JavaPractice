import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList L1=new LinkedList();
        LinkedList L2=new LinkedList();
        LinkedList L3=new LinkedList();
        for(int i=0;i<=8;i++)
        {
            L1.add(sc.next());
        }
        for(int j=0;j<=10;j++)
        {
            L2.add(sc.nextInt());
        }
        LinkedList List1;
        if(L1.size()>L2.size())
        {
            List1=L1;
        }
        else
        {
            List1=L2;
        }
        Iterator itr=L1.iterator();
        Iterator itr1=L2.iterator();
        for(Object o:List1)
        {
            try
            {
                L3.add(itr.next());
            }
            catch(Exception e)
            {

            }
            L3.add(itr1.next());
        }

        for(Object o:L3)
        {
            System.out.print(o+" ");
        }
    }
}
