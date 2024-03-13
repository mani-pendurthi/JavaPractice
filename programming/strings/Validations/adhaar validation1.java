import java.util.Scanner;

class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String Aadhaar=sc.nextLine();
        if(Aadhaar.matches("[0-9]{12}"))
        {
            System.out.print("Valid");
        }
        else if(Aadhaar.matches("[0-9]{4}[ ][0-9]{4}[ ][0-9]{4}"))
        {
            System.out.print("Valid");
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}
