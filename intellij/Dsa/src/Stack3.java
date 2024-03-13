public class Stack3
{
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head;
    void push(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    int pop()
    {
        try
        {
            int k= head.data;
            head=head.next;         //if head==null
            return k;
        }
        catch (Exception e)
        {
            System.out.println("Stack Empty");
            return -1;                                  //else
        }
    }
    int peek()
    {
        return head.data;
    }
    boolean isEmpty()
    {
        return head==null;
    }
    void print(Stack1 s)
    {
        if(!s.isEmpty())
        {
            int k=pop();
            System.out.println(k);
            print(s);
            s.push(k);
        }
    }
}
class run2
{
    public static void main(String[] args)
    {

    }
}
