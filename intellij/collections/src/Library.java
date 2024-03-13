import java.util.*;

public class Library
{
    int id;
    String name;
    String author;
    String publisher;
    public Library(int id,String name,String author,String publisher)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Library> arrayList=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arrayList.add(new Library(sc.nextInt(), sc.next(), sc.next(), sc.next()));
        }
        String sort=sc.next();
        switch (sort)
        {
            case "id":
                Collections.sort(arrayList,new sort1());
                break;
            case "name":
                Collections.sort(arrayList,new sort2());
                break;
            case "author":
                Collections.sort(arrayList,new sort2());
                break;
            case "publisher":
                Collections.sort(arrayList,new sort2());
                break;
        }
        Iterator<Library> itr=arrayList.iterator();
        while(itr.hasNext())
        {
            Library l= itr.next();
            System.out.print(l.id+" ");
            System.out.print(l.name+" ");
            System.out.print(l.author+" ");
            System.out.println(l.publisher+" ");
        }
    }
}
class sort1 implements Comparator<Library>
{
    public int compare(Library a1,Library a2)
    {
        if(a1.id>a2.id)
        {
            return -1;
        }
        else if(a1.id<a2.id)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
class sort2 implements Comparator<Library>
{
    public int compare(Library o1,Library o2)
    {
        return o1.name.compareTo(o2.name);
    }
}


