class A
{
    int a=60;    //global variable
  void m1()
  {
    int a=90;    //local variable
    System.out.print(this.a);    //this keyword at variable level
  }

  public static void main(String []agrgs)
  {
	A obj=new A();
	obj.m1();
  }
}