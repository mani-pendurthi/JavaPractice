import java.util.*;
public class arraylist1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        /*ArrayList<ArrayList<Integer>> obj=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> obj1=new ArrayList<>();
                int s= sc.nextInt();
                for(int j=0;j<s;j++)
                {                                                method 1
                    obj1.add(sc.nextInt());
                }
                obj.add(obj1);
            }
            int i= sc.nextInt();
            int j= sc.nextInt();
            try{
                //System.out.print(obj);
                System.out.print(obj.get(i-1).get(j-1));
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.print("Invalid Index");
            }*/
        ArrayList<ArrayList<Integer>> obj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            obj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++)
        {
            int s= sc.nextInt();                //method 2
            for(int j=0;j<s;j++)
            {
                obj.get(i).add(sc.nextInt());
            }
        }
    }
}
