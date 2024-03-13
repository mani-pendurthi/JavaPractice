import java.util.Scanner;

class Samsung
{
  Scanner sc=new Scanner(System.in);

  String ram=sc.next();
  String rom=sc.next();
  String camera=sc.next();
  String os=sc.next();
  String processor=sc.next();
  String battery=sc.next();
  String display=sc.next();
  int price=sc.nextInt();
  float version=sc.nextFloat();

}
class WholeSaleMarket extends Samsung
{
  int newprice=price+5000;
}
class ReatailMarket extends WholeSaleMarket
{
  int finalprice=newprice+5000;
}
class Customer extends ReatailMarket
{
  static void m1()
  {
	Customer obj=new Customer();

	System.out.println(obj.ram);
	System.out.println(obj.rom);
	System.out.println(obj.camera);
	System.out.println(obj.os);
	System.out.println(obj.processor);
	System.out.println(obj.battery);
	System.out.println(obj.display);
	System.out.println(obj.finalprice);
	System.out.println(obj.version);
  }
  public static void main(String[]args)
  {
	m1();
  }
}