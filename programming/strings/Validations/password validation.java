import java.util.Scanner;
class sample
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        int invc = 0,c1=0,c2=0,c3=0,c4=0;

        if(pass.length()!=9)
        {
            invc++;
        }
        else
        {
            for(int i=0;i<pass.length();i++)
            {
                if(pass.charAt(i)==' ')
                {
                    invc++;
                    break;
                }
                if((pass.charAt(i)>='A' && pass.charAt(i)<='Z') || (pass.charAt(i)>='a' && pass.charAt(i)<='z') || (pass.charAt(i)>='0' && pass.charAt(i)<='9'))
                {
                    c1++;
                }
                else
                {
                    c2++;
                }
            }
        }
        if(c1>=1 && c2>=1 && invc==0)
        {
            System.out.print("Valid Password");
        }
        else
        {
            System.out.print("Invalid Password");
        }
    }
}
