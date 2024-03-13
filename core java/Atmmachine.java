import java.util.Scanner;
class main
{
    static Scanner sc=new Scanner (System.in);
    double amount;
    long acc;
    String name;

    void insert(String n,long ac,double am)
    {
        amount=am;
        acc=ac;
        name=n;
    }
    void deposit(double amt)
    {
        amount=amount+amt;
        System.out.println("Deposit Sucessfull"+"\n"+"Updated balance-"+amount);
    }
    void withdraw(double amt)
    {
        if(amount>=amt)
        {
            amount=amount-amt;
            System.out.println("Collect Cash");
        }
        else
        {
            System.out.println("Transaction Failed ! Due to insufficient balance");
        }
    }
    void displaybalance()
    {
        System.out.print("Your Account Balance-"+amount);
    }
    public static void main(String[]args)
    {
        main obj=new main ();
        obj.insert(sc.next(),sc.nextLong(),sc.nextDouble());

        System.out.println("Select Options Below"+"\n"+"1.Deposit Balance"+"\n"+"2.Withdraw Balance"+"\n"+"3.Check Balance");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.print("Enter Amount-");
                obj.deposit(sc.nextDouble());
                break;
            case 2:System.out.print("Enter Amount-");
                obj.withdraw(sc.nextDouble());
                break;
            case 3:obj.displaybalance();
                break;
            default:System.out.print("Invalid Input !");
        }

    }
}