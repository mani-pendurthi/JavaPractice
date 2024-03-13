import java.util.*;
class V
{
	public static void main(String []args){
		Scanner obj=new Scanner(System.in);

		System.out.println("--TAKING VALUES FROM USER--");

		System.out.print("Enter Integer value-");
		int a=obj.nextInt();

		System.out.print("Enter Float value-");
		float b=obj.nextFloat();

		System.out.print("Enter Boolean value-");
		boolean c=obj.nextBoolean();
		
		System.out.print("Enter Double value-");
		double d=obj.nextDouble();

		System.out.print("Enter Short value-");
		short e=obj.nextShort();

		System.out.print("Enter Long value-");
		long f=obj.nextLong();

		System.out.print("Enter STRING-");
		String s=obj.nextLine();
		
		System.out.println("--BELOW VALUES ARE OBTAINED FROM USER--");

		System.out.println("INTEGER-"+a);
		System.out.println("FLOAT-"+b);
		System.out.println("BOOLEAN-"+c);
		System.out.println("DOUBLE-"+d);
		System.out.println("SHORT-"+e);
		System.out.println("LONG-"+f);
		System.out.print("Entered STRING-"+s);

}
}
