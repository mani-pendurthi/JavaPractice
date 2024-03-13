package problems;

import java.util.Scanner;

public class EmailValidation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String email=sc.next();
        boolean b=email.contains("@");

        if(email.length()>=15 && email.length()<=25 && b==true)
        {
                int id_index=email.indexOf('@');
                int ext_index=email.indexOf('.');
                email=email.toLowerCase();
                int c=0;
                int id_length=email.codePointCount(0,id_index);
                int domain=email.codePointCount(id_index+1,ext_index);

            if(!(email.charAt(0)>='a' && email.charAt(0)<='z'))
            {
                c++;
            }
            if(c==0)
            {
                for(int i=0;i<id_index;i++)
                {
                    char ch=email.charAt(i);
                    if((ch>='a' && ch<='z') || (ch>='0' && ch<='9') || (ch=='_' || ch=='.'))
                    {
                        c++;
                    }
                }
                if(c==id_length)
                {
                    c=0;
                    if((email.charAt(0)=='_' || email.charAt(0)=='.') || (email.charAt(id_index-1)=='_' || email.charAt(id_index-1)=='.'))
                    {
                        c++;
                        System.out.println("3");
                    }
                }
                if(c==0)
                {
                    for(int i=id_index+1;i<ext_index;i++)
                    {
                        char ch=email.charAt(i);
                        if((ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
                        {
                            c++;
                        }
                    }
                    if(c==domain)
                    {
                        c=0;
                        for(int i=ext_index+1;i<email.length();i++)
                        {
                            char ch=email.charAt(i);
                            if(!(ch>='a' && ch<='z'))
                            {
                                c++;
                            }
                        }
                    }
                }
            }
            if(c==0)
            {
                System.out.print("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
        else
        {
            System.out.println("Invalid");
        }

    }
}
