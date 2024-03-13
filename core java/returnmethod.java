import java.util.*;
class A //main class
{
	
int add(int a,int b) //non static & with parameters & return type method
{
	System.out.println("Add method");
	int add = a+b;
	return add;
}

public static void main(String []args) //main method
{
	A obj=new A ();
	Scanner object=new Scanner (System.in);

	System.out.print("Enter A value-");
	int a=object.nextInt();
	System.out.print("Enter B value-");
	int b=object.nextInt();

	int add=obj.add(a,b);
	
	System.out.println("method-returns="+add);
	
}

}