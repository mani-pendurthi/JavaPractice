import java.util.Scanner;
class sample
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String lc="";
        String uc="";
        String dgt="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' &&ch<='z')
            {
                lc=lc+ch;
            }
            else if(ch>='A' && ch<='Z')
            {
                uc=uc+ch;
            }
            else if(ch>='0' && ch<='9')
            {
                dgt=dgt+ch;
            }
        }
        System.out.println("Lower Case-"+lc);
        System.out.println("Upper case-"+uc);
        System.out.println("Digits-"+dgt);
    }
}
