package main.sub.sub1;
public class ConCls3
{
  public ConCls3()
  {
	System.out.println("DEF Constructor");
  }
  public ConCls3(ConCls3 obj)
  {
	System.out.println(obj);
  }
  public float m11(int i)
  {
	System.out.println(i);
	return main.ConCls1.sc.nextFloat();
  }
}