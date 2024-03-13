import java.util.Scanner;

class A
{

static int a=10;
static char b='M';
	 int c=20;

void M1(float a)
{
	System.out.println("Method 1");
}

boolean M2()
{
	boolean b=true;

	return b;
}

static double M3(char x,String y)
{

	double d=2022.222222;

	return d;

}
void M4()
{
	System.out.println("Mehtod 4");
}

public static void main (String []args)
{
	A cobj=new A();

 	Scanner obj=new Scanner (System.in);
  
	System.out.print("Enter String value-");
  	String n=obj.nextLine();

	System.out.print("Enter char value-");
  	char o=obj.next().charAt(0);

	System.out.print("Enter float value-");
  	float m=obj.nextFloat();

System.out.println(a);
System.out.println(b);
System.out.println(cobj.c);

cobj.M1(m);
System.out.println("M2 Method-"+cobj.M2());
System.out.println("M3-"+M3(o,n));
cobj.M4();
  	
}

}