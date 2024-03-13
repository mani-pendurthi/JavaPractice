/*Create java app where we have a bank cls this bank provides customer details such as acc details
such as acc numb,ifsc code,atm pin and acc balance to the customer then the customer has to display
all these properties by using a user defined method and then invoke this method under main by 
providing dynamic input.*/

import java.util.Scanner;
class Bank
{
  Scanner sc=new Scanner(System.in);

  String ifsc=sc.next();
  long accNum=sc.nextLong();
  int atmPin=sc.nextInt();
  double blns=sc.nextDouble();
}
class Customer extends Bank
{

  static void m1()
  {
	Customer obj=new Customer();

	System.out.println(obj.ifsc);
	System.out.println(obj.accNum);
	System.out.println(obj.atmPin);
	System.out.println(obj.blns);
  }
  
  public static void main(String []args)
  {
	
	m1();
  }
}