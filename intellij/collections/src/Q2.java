import java.util.ArrayList;
import java.util.ListIterator;

public class Q2
{
    public static void main(String[] args)
    {
        ArrayList Al=new ArrayList();
        Al.add(50);
        Al.add("Quantumania");
        Al.add('E');
        Al.add(6.3f);
        Object[] arr=Al.toArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ArrayList Al2=new ArrayList();
        Al2.addAll(Al);
        Al2.add("Realm");
        Al2.add(616);
        Al2.add(838);
        Al2.add('R');
        ListIterator itr=Al2.listIterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        while(itr.hasPrevious())
        {
            System.out.print(itr.previous()+" ");
        }
        System.out.println();
        Al2.set(1,"Quantum");
        Al2.remove((Integer)838);
        for(int i=0;i<Al2.size();i++)
        {
            System.out.println(Al2.get(i)+" ");
        }
    }
}
