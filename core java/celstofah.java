import java.util.*;
class A
{

public static void main(String [] args)
{
	Scanner obj=new Scanner (System.in);
	System.out.print("Enter Temperature in degrees value-");
	int a = obj.nextInt();
	double conv=(a*1.8)+32;
	System.out.println(a+"C to "+conv+"F");

}

}