package AtmPin;

public class InvalidAtmPinException extends Exception 
{
	public InvalidAtmPinException(String msg)
	{
		System.out.println(msg);
	}

}
