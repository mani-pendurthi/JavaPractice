package user_defined_exception;

public class InvalidLoginException extends Exception{

	public InvalidLoginException(String message)
	{
		System.out.println(message);
	}
}
