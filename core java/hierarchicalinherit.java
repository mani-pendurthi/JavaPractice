import java.util.Scanner;
class Organisation
{
  Scanner sc=new Scanner(System.in);

  int empId=sc.nextInt();
  long empNo=sc.nextLong();
  double empSalary=sc.nextDouble();
  String workLoc=sc.next();
  String empName=sc.next();
}
class Emp1 extends Organisation
{
  void display1()
  {
	System.out.println("Employee1");
	System.out.println(empId);
	System.out.println(empNo);
	System.out.println(empSalary);
	System.out.println(workLoc);
	System.out.println(empName);
	
  }
}
class Emp2 extends Organisation
{
  void display2()
  {
	System.out.println("Employee2");
	System.out.println(empId);
	System.out.println(empNo);
	System.out.println(empSalary);
	System.out.println(workLoc);
	System.out.println(empName);
  }
}
class Emp3 extends Organisation
{
  void display3()
  {
	System.out.println("Employee3");
	System.out.println(empId);
	System.out.println(empNo);
	System.out.println(empSalary);
	System.out.println(workLoc);
	System.out.println(empName);
  }
}
class Emp4 extends Organisation
{
  void display4()
  {
	System.out.println("Employee4");
	System.out.println(empId);
	System.out.println(empNo);
	System.out.println(empSalary);
	System.out.println(workLoc);
	System.out.println(empName);
  }
}
class Emp5 extends Organisation
{
  void display5()
  {
	System.out.println("Employee5");
	System.out.println(empId);
	System.out.println(empNo);
	System.out.println(empSalary);
	System.out.println(workLoc);
	System.out.println(empName);
  }
  
}
class test 
{
  public static void main(String[]args)
  {
	Emp1 obj=new Emp1();
	obj.display1();

	Emp2 obj1=new Emp2();
	obj1.display2();

	Emp3 obj2=new Emp3();
	obj2.display3();

	Emp4 obj3=new Emp4();
	obj3.display4();

	Emp5 obj4=new Emp5();
	obj4.display5();
  } 
}
