import java.util.ArrayList;
import java.util.Iterator;

public class Q3
{
    public static void main(String[] args) {
        ArrayList<Integer> Al=new ArrayList();
        Al.add(10);
        Al.add(20);
        Al.add(40);
        Al.add(80);
        Iterator obj=Al.iterator();
        while(obj.hasNext())
        {
            System.out.print(obj.next()+" ");
        }
        System.out.println();
        ArrayList<String> Al2=new ArrayList<>();
        Al2.add("Tom cruise");
        Al2.add("Steven");
        Al2.add("John");
        Al2.add("Chris");
        for(String s:Al2)
        {
            System.out.print(s+" ");
        }
    }
}
