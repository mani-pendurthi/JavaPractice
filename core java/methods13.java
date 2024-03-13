import java.util.Scanner;
class A
{

  String emp(int emp_id,String emp_name,String emp_desig,String emp_loc)
  {  
     System.out.println("\n"+"EMPLOYEE NAME-"+emp_name+"\n"+"EMPLOYEE ID-"+emp_id+"\n"+"EMPLOYEE DESIGNATION-"+emp_desig+"\n"+"EMPLOYEE LOCATION-"+emp_loc);
     
	//System.out.println("EMPLOYEE ID-"+emp_id);

	String company="GOOGLE";
     return company;

  }

  public static void main(String []args)
  {
	Scanner obj=new Scanner (System.in);
	A clob=new A ();

	int people=1;

	for (int i=1;i<=people;i++)
	{
		people++;

	if(people>21)
	{

	break;

		
	}
	else
	{
		//System.out.print("ENTER EMPLOYEE NAME-");
		String emp_name1=obj.nextLine();
		
		System.out.print("ENTER EMPLOYEE NAME-");
		String emp_name=obj.nextLine();

		System.out.print("ENTER EMPLOYEE DESIGNATION-");
		String emp_desig=obj.nextLine();

		System.out.print("ENTER EMPLOYEE LOCATION-");
		String emp_loc=obj.nextLine();

		System.out.print("ENTER EMPLOYEE ID-");
      	int emp_id=obj.nextInt();

		System.out.println("COMPANY NAME-"+clob.emp(emp_id,emp_name,emp_desig,emp_loc)+"\n");
	}
	}
	
  }

}
