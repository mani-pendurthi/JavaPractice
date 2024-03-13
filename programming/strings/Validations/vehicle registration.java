import java.util.Scanner;
class sample
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String veh = sc.nextLine();
        int c1 = 0;

        if(veh.length()!=13)
        {
            c1++;
        }
        else
        {
            for(int i=0;i<veh.length();i++)
            {
                if(i==2 || i==5 || i==8)
                {
                    if(veh.charAt(i)!=' ')
                    {
                        c1++;
                        break;
                    }
                }
                else if(i==0 || i==1 || i==6 || i==7)
                {
                    if(!(veh.charAt(i)>='A' && veh.charAt(i)<='Z'))
                    {
                        c1++;
                        break;
                    }
                }
                else
                {
                    if(!(veh.charAt(i)>='0' && veh.charAt(i)<='9'))
                    {
                        c1++;
                        break;
                    }
                }
            }
        }

        if (c1 == 0)
        {
            System.out.print("Valid Registration Number");
        }
        else
        {
            System.out.print("Invalid Registration Number");
        }
    }
}
