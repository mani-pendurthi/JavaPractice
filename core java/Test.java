package p4;
import mainpackage.*;
import mainpackage.sub.*;
import java.util.Scanner;
class Test extends AbsCls1 implements In1,In2,In3
{
  static Scanner sc=new Scanner(System.in);
  Test()
  {
	super(sc.nextInt());
  }
  public String m3(char a)
  {
	System.out.println(a);
  	return sc.next();
  }
  public long m5(short a)
  {
	System.out.println(a);
	return sc.nextLong();
  }
  public float m7(int a)
  {
	System.out.println(a);
	return sc.nextFloat();
  }
  public int m8(float a)
  {
	System.out.println(a);
	return sc.nextInt();
  }
  public static void main(String[]args)
  {
	A2 obj=new A2(sc.nextInt());
      A2.m1(sc.nextFloat());
	obj.m2(sc.nextInt());
	AbsCls1 obj1=new Test();
	obj1.m3(sc.next().charAt(0));
	obj1.m4(sc.nextInt());
	In1 obj2=(In1)obj1;
	obj2.m5(sc.nextShort());
	In1.m6(sc.nextInt());
	In2 obj3=(In2)obj1;
	obj3.m7(sc.nextInt());
      In2.m8(sc.next());
	In3 obj4=(In3)obj1;
	obj4.m8(sc.nextFloat());
	In3.m9(sc.next().charAt(0));
  }
}