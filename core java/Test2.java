package p4;
import java.util.Scanner;
import AccModifiers.*;
public class Test2 extends NewClass
{
  static Scanner sc1=new Scanner(System.in);
  public static void main(String[]args)
  {
	Test2 obj1=new Test2();
	NewClass obj=new NewClass();
	//obj.m1(AccModifiers.NewClass.sc.nextFloat());
	//obj.m3();
	obj.m1(sc1.nextFloat());
	obj1.m3();
  }
}