import java.util.Scanner;

class emailvalidation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String email=sc.next();
        int id=0,domain=0,c=0;
        boolean b=true;
        if(email.length()>=15 && email.length()<=25)
        {
            id=email.indexOf('@');
            if(id>0)
            {
                if((email.charAt(0)>=65 && email.charAt(0)<=122) && (email.charAt(id-1)!='.' ||email.charAt(id-1)!='_' ))
                {
                    for(int i=0;i<id;i++)
                    {
                        if((email.charAt(i)>=65 && email.charAt(i)<=122) || (email.charAt(i)>=49 && email.charAt(i)<=57) || (email.charAt(i)=='0' || email.charAt(i)=='.' || email.charAt(i)=='_'))
                        {
                            c++;
                        }
                        else
                        {
                            break;
                        }
                    }
                    if(c==id)
                    {
                        c=0;
                        domain=email.lastIndexOf('.');

                        for(int i=id+1;i<domain;i++)
                        {
                            if((email.charAt(i)>=65 && email.charAt(i)<=122) || (email.charAt(i)>=49 && email.charAt(i)<=57) || email.charAt(i)=='0')
                            {
                                c++;
                            }
                            else
                            {
                                break;
                            }
                        }
                        if(c==email.codePointCount(id+1,domain))
                        {
                            c=0;
                            int i=0;
                            for(i=domain+1;i<email.length();i++)
                            {
                                if(email.charAt(i)>=65 && email.charAt(i)<=122)
                                {
                                    b=true;
                                }
                                else
                                {
                                    b=false;
                                    break;
                                }
                            }
                            if(b==true)
                            {
                                System.out.print("Valid Email Id");
                            }
                            else
                            {
                                System.out.print("Invalid Email Id 6");
                            }

                        }
                        else
                        {
                            System.out.print("Invalid Email ID 5");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Email ID 4");
                    }
                }
                else
                {
                    System.out.print("Invalid Email ID 3");
                }
            }
            else
            {
                System.out.print("Invalid Email ID 2");
            }
        }
        else
        {
            System.out.print("Invalid Email ID 1");
        }
    }
}
