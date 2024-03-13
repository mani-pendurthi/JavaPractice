package exception_handling;

public class exp3 
{
	
	public static void main(String[]args)
	{
		try
		{
			System.out.println(args[5]);
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
			System.out.println(Integer.parseInt(args[2]));
	    }
		catch(ArrayIndexOutOfBoundsException e)
		{
		  System.out.println("Invalid Array Index Entered");
	    }
		catch(ArithmeticException e)
		{
		  System.out.println("You cannot divide any number with Zero");
		}
		catch(NumberFormatException e)
		{
		  System.out.println("Alphabets cannot be converted into integer");
		}
	    finally
		{
		  System.out.println("Error msg found");
	    }
	}
}