class main
{
    static java.io.PrintStream p=System.out;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        p.println(s.length());
        s=s.trim();
        p.println(s.length());
    }
}