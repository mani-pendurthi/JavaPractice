public class Doublelinkedlist
{
    class Node
    {
        int data;
        Node previous;
        Node next;
        Node(int data)
        {
            this.data=data;
            previous=null;
            next=null;
        }
    }
    Node head=null;
    Node tail=null;
    void addFirst(int para)
    {
        Node NewNode=new Node(para);
        if(head==tail)
        {
            head=NewNode;
        }
        else
        {
            head.previous=NewNode;
            NewNode.next=head;
            head=NewNode;
        }
    }
    void addLast(int data)
    {
        Node NewNode=new Node(data);
        if(head==null)
        {
            head=NewNode;
        }
        else
        {
            tail.next=NewNode;
            NewNode.previous=tail;
            tail=NewNode;
        }
    }
    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("No Elements Found");
        }
        if(head==tail)
        {
            head=null;
            tail=null;
        }
        else
        {
            head.next=head;
            head.previous=null;
        }
    }
    void deleteLast()
    {
        if(tail==null)
        {
            System.out.println("No Element Found");
        }
        if(head==tail)
        {
            tail=null;
        }
        else
        {
            tail=tail.previous;
            tail.next=null;
        }
    }
    void print()
    {
        if(head==null)
        {
            System.out.println("No Elements Found");
        }
        else
        {
            while(tail.next!=null)
            {
                Node temp=head;
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
