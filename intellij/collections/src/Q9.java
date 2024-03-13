import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Q9
{
    public static void main(String[] args)
    {
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(5);
        tree.add(14);
        tree.add(8);
        tree.add(4);
        tree.add(10);
        tree.add(6);
        tree.add(9);
        Iterator<Integer> iterator=tree.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        TreeSet<Integer> tree2=new TreeSet<>(tree.descendingSet());
        Iterator<Integer> iterator2=tree2.iterator();
        while(iterator2.hasNext())
        {
            System.out.print(iterator2.next()+" ");
        }
    }
}
