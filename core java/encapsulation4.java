import java.util.Scanner;
class Bank
{
  private long AccNo;
  private double AccBal;
  
  
  Bank(double acbal)
  {
	AccBal=acbal;
  }
  void setAccNo(long acno)
  {
	AccNo=acno;
  }
  long getno()
  {
    return AccNo;
  }
  double getbal()
  {
    return AccBal;
  }
}
class B
{
  
  static Scanner sc=new Scanner(System.in);
  
  public static void main(String[]args)
  {
	Bank obj=new Bank(sc.nextDouble());
	obj.setAccNo(sc.nextLong());
	System.out.println(obj.getno());
	System.out.println(obj.getbal());
  }
}