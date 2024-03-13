/*create java app it contains 1 cls it contains 2 instance variable without values provide
dynamic input by using double parameterised constructor one obj para constr and if we call
instance variable through the obj of an obj para constr.We need to get same user defined 
values that are given for double para const*/

import java.util.Scanner;
class A
{
  static Scanner sc=new Scanner(System.in);
  int a;
  float b;
  
  A(int a,float b)
  {
	this.a=a;
	this.b=b;
  }
  A(A obj)
  {
	System.out.println(obj.a);
	System.out.println(obj.b);
  }
  public static void main(String[]args)
  {
	A obj1=new A(sc.nextInt(),sc.nextFloat());
	new A(obj1);
  }
}