import java.util.Scanner;
class A
{
  private String EmpName;
  private String Designation;

  void setname(String name)
  {
	EmpName=name;
  }
  void setdesig(String desig)
  {
	Designation=desig;
  }
  String getname()
  {
	return EmpName;
  }
  String getdesig()
  {
	return Designation;
  }
  float m1(int b)
  {
    System.out.println(b);
    return 6.5f;
  }
  
}
class B extends A
{
  static Scanner sc=new Scanner(System.in);
  int m1(float a)
  {
	System.out.println(a);
	m1(sc.nextInt());
	return sc.nextInt();
  }
  float m1(int b)
  {
	System.out.println(super.m1(b));
     return sc.nextFloat();
  }
  public static void main(String[]args)
  {
	A obj=new A();
	obj.setname(sc.next());
	obj.setdesig(sc.next());
	System.out.println(obj.getname());
	System.out.println(obj.getdesig());
     new B().m1(sc.nextFloat());
  }
}