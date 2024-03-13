import java.util.Scanner;
class Customer
{
    static Scanner sc=new Scanner(System.in);
    static int restaurent()
    {
        System.out.println("Select Restaurents Below");
        System.out.println("1.Paradise");
        System.out.println("2.Pista House");
        System.out.println("3.Mehfil");
        System.out.println("4.Kfc");
        System.out.print("Option :");
        return sc.nextInt();
    }
}
abstract class menu extends Customer
{
    abstract void food();
    abstract void drinks();
}
class Restuarent extends menu
{
    int food;
    int foodqty;
    int drinkqty;
    static Orders order=new Orders();
    void food()
    {
        System.out.println();
        System.out.println("Select Food items and Quantity");
        System.out.println("1.Chicken Fry piece Biryani  -Rs 200/-");
        System.out.println("2.Chicken Dum Biryani        -Rs 250/-");
        System.out.println("3.Mutton Biryani             -Rs 300/-");
        System.out.println("4.Prawn Biryani              -Rs 280/-");
        System.out.print("Select Food item :");
        food=sc.nextInt();
        System.out.print("Select Quantity :");
        foodqty=sc.nextInt();
        order.foodBill(food,foodqty);
    }
    void drinks()
    {
        System.out.println();
        System.out.println("Select Drinks qty ");
        System.out.println("1.Coke        -Rs 50/-");
        System.out.println("2.ThumbsUp    -Rs 50/-");
        System.out.println("3.Sprite      -Rs 50/-");
        System.out.println("4.Pepsi       -Rs 50/-");
        System.out.print("Select Quantity :");
        drinkqty= sc.nextInt();
        order.drinksBill(drinkqty);
    }
}
class Orders extends Restuarent
{
    private int frypiece=200;
    private int dum=250;
    private int mutton=300;
    private int prawn=280;
    private int drinks=50;
    static int amount;
    void foodBill(int food, int qty)
    {
        int price=0;
        if(food==1)
        {
            amount+=(frypiece*qty);
            System.out.println("Frypiece Biryani     "+qty+" - "+amount);
        }
        else if (food==2)
        {
            amount+=(dum*qty);
            System.out.println("Dum Biryani    "+qty+" - "+amount);
        }
        else if(food==3)
        {
            amount+=(mutton*qty);
            System.out.println("Mutton Biryani     "+qty+" - "+amount);
        }
        else
        {
            amount+=(prawn*qty);
            System.out.println("Prawn Biryani    "+qty+" - "+amount);
        }
    }
    void drinksBill(int qty)
    {
        amount+=(drinks*qty);
        System.out.println("Drinks    "+qty+" - "+amount);
    }
    static void finalBill()
    {

        System.out.println("Order amount          -Rs."+amount);
        System.out.println("Delivery Charges      -Rs.48");
        System.out.println("GST                   -Rs.22");
        System.out.println("Total amount to pay   -Rs."+(amount+48+22));
    }

}

public class Swiggy extends Orders
{
    public static void main(String[] args)
    {
        Customer customer=new Customer();
        int option=customer.restaurent();
        if(option>0)
        {
            menu menu=new Swiggy();
            menu.food();
            menu.drinks();
        }
        System.out.println();
        System.out.println("Do you want to continue with your payment\n1.Yes \n2.NO");
        System.out.print("Option :");
        int option2= sc.nextInt();
        if(option2==1)
        {
            Orders.finalBill();
            System.out.println("Your order will be delivered shortly");
        }
        else
        {
            System.out.print("Come Again");
        }
    }
}
