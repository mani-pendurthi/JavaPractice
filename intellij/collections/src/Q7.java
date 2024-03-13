import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet Hs=new HashSet();
        for(int i=0;i<6;i++)
        {
            Hs.add(sc.next());
        }
        Hs.add(null);
        Hs.add("String");
        Hs.add(null);
        Iterator Itr=Hs.iterator();
        while(Itr.hasNext())
        {
            System.out.println(Itr.next());
        }
    }
}
