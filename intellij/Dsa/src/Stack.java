import java.util.*;

public class Stack
{
        ArrayList<Integer> obj=new ArrayList<>();
        void push(int a)
        {
            obj.add(a);
        }
        int pop()
        {
            if(obj.size()==0)
            {
                System.out.println("Stack is empty");
            }
            int temp= obj.get(obj.size()-1);
            obj.remove(obj.size()-1);
            return temp;
        }
        int peek()
        {
            if(obj.size()==0)
            {
                return -1;
            }
            else
            {
                return obj.get(obj.size()-1);
            }
        }
        boolean isEmpty()
        {
            if(obj.size()==0)
            {
                return true;
            }
            return false;
        }
}
class Run
{
    public static void main(String[] args)
    {
        Stack obj=new Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.isEmpty());
    }
}
