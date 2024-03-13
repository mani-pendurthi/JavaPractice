import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class arraylist
{
    public static void main(String[] args)
    {
        //Scanner sc=new Scanner(System.in);
        ArrayList obj=new ArrayList();
        for(int i=1;i<=5;i++)
        {
            obj.add(i);
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(obj.get(i)+" ");
        }
        System.out.print(obj);
        for(Object i:obj)
        {
            System.out.print(i+" ");
        }
        Iterator it=obj.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}