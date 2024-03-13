class A
{
	static int a=10;
		int b=20;
	     int c=30;

static void display() //Non return , static , without parameters
{
	System.out.println("Display method");
}

char m1(char d) //
{
	char e='M';
	return e; 
}

static boolean m2(float f)
{
	boolean x=true;
	return x; 
}



public static void main(String []args)
{
	A obj=new A ();
	display();
	System.out.println(obj.m1('F'));
	System.out.println(m2(1.0f));
	System.out.println(a);
	System.out.println(obj.b);
	System.out.println(obj.c);
}
}