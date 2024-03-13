import java.util.Scanner;

class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String Aadhaar=sc.nextLine();
        int c=0;
        if(Aadhaar.length()!=12 && Aadhaar.length()!=14)
        {
            c++;
        }
        else if(Aadhaar.length()==12)
        {
            for(int i=0;i<Aadhaar.length();i++)
            {
                if(!(Aadhaar.charAt(i)>='0' && Aadhaar.charAt(i)<='9'))
                {
                    System.out.print("C");
                    c++;
                    break;
                }
            }
        }
        else
        {
            for(int i=0;i<Aadhaar.length();i++)
            {
                if(i==4 || i==9)
                {
                    if(Aadhaar.charAt(i)!=' ')
                    {
                        c++;
                        break;
                    }

                }
                else
                {
                    if(!(Aadhaar.charAt(i)>='0' && Aadhaar.charAt(i)<='9'))
                    {
                        c++;
                        break;
                    }
                }
            }
        }
        if(c==0)
        {
            System.out.print("Valid Aadhaar Number");
        }
        else
        {
            System.out.print("Invalid Aadhaar Number");
        }
    }
}
