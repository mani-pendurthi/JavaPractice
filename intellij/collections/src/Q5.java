import java.util.*;
public class Q5
{
    public static void main(String[] args)
    {
        LinkedList LL=new LinkedList();
        LL.add("LinkedList");
        LL.add(10);
        LL.add(5.6f);
        LL.add('L');
        LL.add(true);
        System.out.println(LL.size());
        LL.pollFirst();
        LL.pollLast();
        ListIterator LI=LL.listIterator(LL.size());
        while(LI.hasPrevious())
        {
            System.out.print(LI.previous()+" ");
        }
        System.out.println();
        while(LI.hasNext())
        {
            System.out.print(LI.next()+" ");
        }
    }
}
