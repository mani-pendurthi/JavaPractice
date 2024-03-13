import java.util.Scanner;
class A
{

  public static void main(String []args)
  {  
    Scanner obj=new Scanner (System.in);
    
  
    System.out.print("Enter A value=");
    int a=obj.nextInt();
    System.out.print("Enter B value=");
    int b=obj.nextInt();
    
    System.out.println("\n"+"Select Options below");
    System.out.println("1]ADDITION"+"\n"+"2]SUBTRACTION"+"\n"+"3]MULTIPLICATION"+"\n"+"4]DIVISION");

    System.out.print("\n"+"Enter Your Option=");
    int n=obj.nextInt();

    switch(n)
    {
    case 1:System.out.println("ANSWER="+(a+b));
    break;
    case 2:System.out.println("ANSWER="+(a-b));
    break;
    case 3:System.out.println("ANSWER="+(a*b));
    break;
    case 4:System.out.println("ANSWER="+(a/b));
    break;
    default:System.out.println("Invalid input");
    }

	
  }

}