/*create a java app where we have 1 cls it contains 1 non static method m1 with parameter 
and return we also have another class which contains m2 method which is of non static with 
parameter and return type then invoke both methods under main without using is-a,has-a,
user-a,between classes and by providing dynamic inputs.*/

import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  static A obj=new A();
  int m1(int a)
  {
	return a;
  }
}
class B 
{
  float m2(float b)
  {
	return b;
  }
  public static void main(String[]args)
  {
	B obj2=new B();
	System.out.println(A.obj.m1(A.sc.nextInt())); //A(class).sc(variable(object for scanner cls))
	System.out.println(obj2.m2(A.sc.nextFloat()));
  }
}
