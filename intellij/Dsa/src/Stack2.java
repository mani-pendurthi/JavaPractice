public class Stack2
{
    class Node
    {
        int data;
        Node Next;
        Node(int data)
        {
            this.data=data;
            Next=null;
        }
    }
    Node head;
    void push(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.Next=head;
        head=newNode;
    }
    int pop()
    {
        if(head==null)
        {
            System.out.println("Stack Empty");
            return -1;
        }
        else
        {
            int k= head.data;
            head=head.Next;
            return k;
        }
    }
    int peek()
    {
        if(head==null)
        {
            System.out.println("Stack Empty");
            return -1;
        }
        else
        {
            return head.data;
        }
    }
    boolean isEmpty()
    {
        return head==null;
    }
}
class run1
{
    public static void main(String[] args)
    {
        Stack2 obj=new Stack2();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
    }
}

