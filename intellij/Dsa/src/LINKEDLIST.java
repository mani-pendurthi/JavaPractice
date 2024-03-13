public class LINKEDLIST
{
   public class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private node head=null;
    public void addFirst(int data)
    {
        node nn=new node(data);
        if(head==null)
        {
            head=nn;
        }
        else
        {
            head.next=head;
            head=nn;
        }
    }
    public void addLast(int data)
    {
        node nn=new node(data);
        if(head==null)
        {
            head=nn;
        }
        else
        {
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=nn;
        }
    }
    public void add(int index,int data)
    {
        try{
            node nn=new node(data);
            node temp=head;
            int c=0;
            while(c<=index)
            {
                if(c==index)
                {

                }
                c++;
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    public void print()
    {
        node temp=head;
        if(head==null)
        {
            System.out.println("List Empty");
        }
        else
        {
            while (temp.next!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public int removeFirst()
    {
        if(head==null)
        {
            System.out.print("List is empty");
            return Integer.MAX_VALUE;
        }
        else if(head.next==null)
        {
            int data= head.data;
            head=null;
            return data;
        }
        else
        {
            int data=head.data;
            head=head.next;
            return data;
        }
    }
    public int removeLast()
    {
        if(head==null)
        {
            System.out.print("List is empty");
            return Integer.MAX_VALUE;
        }
        else if(head.next==null)
        {
            int data= head.data;
            head=null;
            return data;
        }
        else
        {
            node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            int data=temp.next.data;
            temp.next=null;
            return data;
        }
    }
    public int length()
    {
        int c=0;
        if(head==null)
        {
            return c;
        }
        node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        return c;
    }
    public boolean isCircular()
    {
        if(head==null)
        {
            return false;
        }
        node fast=head;
        node slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                int len=1;
                while(slow.next!=fast)
                {
                    len++;
                    slow=slow.next;
                }
                System.out.println(len);
                return true;
            }
        }
        return false;
    }

    public void circularList()
    {
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
    }

}
class Main1
{

    public static void main(String[] args)
    {
        LINKEDLIST ll=new LINKEDLIST();
        ll.addFirst(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);

        //System.out.println(ll.length());
        ll.circularList();
        System.out.println(ll.isCircular());
    }
}
