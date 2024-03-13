/*create java app 1 cls.It contains 2 instance variables without values providing
user defined values for instance variable by using a double parameterised constructor
and print those values which we invoke this values under main by providing dynamic input*/


import java.util.Scanner;
class Main
{
    static Scanner sc=new Scanner(System.in);
    int a;
    float b;
    
    Main(int a,float b)
    {
        this.a=a;
        this.b=b;
        System.out.println(this.a);
        System.out.print(this.b);
    }
    
    public static void main(String[]args)
    {
        new Main(sc.nextInt(),sc.nextFloat());
    }
}