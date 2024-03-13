import java.util.*;
public class Q8
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<Integer> LHS1=new LinkedHashSet();
        LinkedHashSet<Integer> LHS2=new LinkedHashSet();
        for(int i=0;i<5;i++)
        {
            LHS1.add(sc.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            LHS2.add(sc.nextInt());
        }
        LHS2.addAll(LHS1);
        Iterator<Integer> Itr=LHS2.iterator();
        int sum=0;
        while(Itr.hasNext())
        {
            int a=Itr.next();
            System.out.print(a+" ");
            sum+=a;
        }
        System.out.print("sum-"+sum);
    }
}
