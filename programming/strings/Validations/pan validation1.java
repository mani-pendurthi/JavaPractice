import java.util.Scanner;

class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String Pan=sc.nextLine();
        String Name=sc.nextLine();
        int c=0;
        if(Pan.length()!=10)
        {
            System.out.print("1");
            c++;
        }
        else
        {
            for(int i=0;i<3;i++)
            {
                if(!(Pan.charAt(i)>='A' && Pan.charAt(i)<='Z'))
                {
                    System.out.print("2");
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                if(Pan.charAt(3)!='A' && Pan.charAt(3)!='C' && Pan.charAt(3)!='F' && Pan.charAt(3)!='P' && Pan.charAt(3)!='H' && Pan.charAt(3)!='T')
                {
                    System.out.print("3");
                    c++;
                }
                else
                {
                    if(Pan.charAt(4)!=Name.charAt(0))
                    {
                        System.out.print("4");
                        c++;
                    }
                    else
                    {
                        for(int i=5;i<=8;i++)
                        {
                            if(!(Pan.charAt(i)>='0' && Pan.charAt(i)<='9'))
                            {
                                System.out.print("5");
                                c++;
                                break;
                            }
                        }
                        if(c==0)
                        {
                            if(!(Pan.charAt(9)>='A' && Pan.charAt(9)<='Z'))
                            {
                                System.out.print("6");
                                c++;
                            }
                        }
                    }
                }

            }
        }
        if(c==0)
        {
            System.out.print("Valid Pan Number");
        }
        else
        {
            System.out.print("Invalid Pan Number");
        }
    }
}
