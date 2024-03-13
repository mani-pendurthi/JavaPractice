import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String New="";
        for(int i=s.length()-1;i>=0;i--)
        {
            New=New+s.charAt(i);
        }
        if(s.equals(New))
        {
            System.out.print("Given string is palindrome");
        }
        else
        {
            System.out.print("Given string is not a palindrome");
        }
    }
}
