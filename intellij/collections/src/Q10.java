import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Q10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> tree=new TreeSet<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            tree.add(sc.nextInt());
        }
        int a= sc.nextInt();
        System.out.print(tree.headSet(a));
        int b= sc.nextInt();
        System.out.println(tree.tailSet(b));

    }
}
