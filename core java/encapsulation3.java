import java.util.Scanner;
class A
{
  private String Empname;
  private int Empid;
  
  A(String name,int id)
  {
	Empname=name;
	Empid=id;
  }
  String getname()
  {
	return Empname;
  }
  int getid()
  {
	return Empid;
  }
}
class B
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[]args)
  {
	A obj=new A(sc.next(),sc.nextInt());
	System.out.println(obj.getname());
	System.out.println(obj.getid());
  }
}
