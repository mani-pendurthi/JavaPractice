import java.util.Scanner;
class Bank
{
  private int AtmPin=5632;

  void setPin(int pin)
  {
     AtmPin=pin;
  }
  int getAtmPin()
  {
	return AtmPin;
  }
  
}
class Customer
{
  static Scanner sc=new Scanner(System.in);
  static Bank obj=new Bank();
  public static void main(String[]args)
  {
	obj.setPin(sc.nextInt());
     System.out.print(obj.getAtmPin());
  }
}