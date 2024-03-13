package main1;
import java.util.Scanner;
import main.*;
import main.sub.*;
class Test1 extends AbsCls2 implements Inte1,Inte2,Inte3,Inte4,main.sub.sub1.Inte5,main.sub.sub1.Inte6
{
  static Scanner sc=new Scanner (System.in);
  Test1()
  {
	super(sc.nextInt());
  }
  public boolean m2(int c)
  {
	System.out.println(c);
	return sc.nextBoolean();
  }
  public String m3(char c)
  {
	System.out.println(c);
	return sc.next();
  }
  public char m5(int a)
  {
	System.out.println(a);
	return sc.next().charAt(0);
  }
  public boolean m7(double e)
  {
	System.out.println(e);
	return sc.nextBoolean();
  }
  public boolean m9(String g)
  {
	System.out.println(g);
	return sc.nextBoolean();
  }
  public boolean m12(char j)
  {
	System.out.println(j);
	return sc.nextBoolean();
  }
  public double m14(char l)
  {
      System.out.println(l);
	return sc.nextDouble();
  }
  public static void main(String[]args)
  {
	ConCls1 obj=new ConCls1(sc.nextInt());
	System.out.println(obj.m1(sc.nextFloat()));

	AbsCls2 obj1=new Test1();
	System.out.println(obj1.m2(sc.nextInt()));

	Inte1 obj2=(Inte1)obj1;
	System.out.println(obj2.m3(sc.next().charAt(0)));
	System.out.println(Inte1.m4(sc.nextLong()));
	
	Inte2 obj3=(Inte2)obj1;
	System.out.println(obj3.m5(sc.nextInt()));
	System.out.println(Inte2.m6(sc.nextShort()));
	
	Inte3 obj4=(Inte3)obj1;
	System.out.println(obj4.m7(sc.nextDouble()));
	System.out.println(Inte3.m8(sc.nextInt()));

	Inte4 obj5=(Inte4)obj1;
	System.out.println(obj5.m9(sc.next()));
	System.out.println(Inte4.m10(sc.next().charAt(0)));

	main.sub.sub1.ConCls3 obj6=new main.sub.sub1.ConCls3(new main.sub.sub1.ConCls3());
	System.out.println(obj6.m11(sc.nextInt()));

	main.sub.sub1.Inte5 obj7=(main.sub.sub1.Inte5)obj1;
	System.out.println(obj7.m12(sc.next().charAt(0)));
	System.out.println(main.sub.sub1.Inte5.m13(sc.next().charAt(0)));

	main.sub.sub1.Inte6 obj8=(main.sub.sub1.Inte6)obj1;	
	System.out.println(obj8.m14(sc.next().charAt(0)));
	System.out.println(main.sub.sub1.Inte6.m15(sc.next().charAt(0)));

  }
}