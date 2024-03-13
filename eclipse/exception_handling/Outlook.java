package exception_handling;
import java.util.Scanner;
import user_defined_exception.InvalidLoginException;

public class Outlook {

	static Scanner sc=new Scanner(System.in);
	
	static String user="johnwick@outlook.com";
	static String pin="boogeyman";
	static void validate(String id,String password) throws InvalidLoginException
	{
		if(id.equals(user) && password.equals(pin))
		{
			System.out.println("Welcome User");
		}
		else
		{
			InvalidLoginException obj=new InvalidLoginException("Invalid Credentials");
			throw obj;
		}
	}
	public static void main(String[] args) throws InvalidLoginException 
	{
		String id=sc.next();
		String password=sc.next();	
		validate(id,password);
	}
}
