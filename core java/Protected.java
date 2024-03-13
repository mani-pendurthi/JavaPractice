interface I
{
    int a=10;
}
class main implements I
{

    public static void main(String[] args)
    {
        a=20;
        System.out.print(a);
    }
}