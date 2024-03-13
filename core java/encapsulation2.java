import java.util.Scanner;
class A
{
   private String Empname;
   private int Empid;
   private int Empsalary;

   void setname(String name)
   {
	Empname=name;
   }
   void setid(int id)
   {
	Empid=id;
   }
   void setsalary(int salary)
   {
	Empsalary=salary;
   }
   String getname()
   {
	return Empname;
   }
   int getid()
   {
	return Empid;
   }
   int getsalary()
   {
	return Empsalary;
   }
}
class B extends A
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[]args)
  {
	A obj=new A();
	obj.setname(sc.next());
	obj.setid(sc.nextInt());
	obj.setsalary(sc.nextInt());
	System.out.println(obj.getname());
	System.out.println(obj.getid());
	System.out.println(obj.getsalary());
  }
}
