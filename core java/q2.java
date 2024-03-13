import java.util.Scanner;
class A
{
		
	static boolean m1(float f,char c)
     {	
		
		boolean x=true;
		return x;
	}
	void m2(double d)
	{
		System.out.print("M2");
	}
	public static void main(String [] args)
	{
		Scanner obj=new Scanner (System.in);
		float f=obj.nextFloat();
		char c=obj.next().charAt(0);
		double d=obj.nextDouble();

		A n=new A ();

		System.out.print(m1(f,c));
		new A().m2(d);
	
	}
}