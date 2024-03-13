package problems;
import java.util.Scanner;
public class NumToWords
{
    static int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60, 70, 80, 90};
    static String str[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen","Twenty",
    "Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        String n=""+a;
        int len=n.length();
        switch(len)
        {
            case 1:
                System.out.print(str[a-1]);
                break;
            case 2:
                two(n);
                break;
            case 3:
                three(n);
                break;
            case 4:
                four(n);
                break;
            case 5:
                five(n);
                break;
        }
    }
    static void two(String s) {
        if(Integer.parseInt(s)<=20)
        {
            System.out.print(str[Integer.parseInt(s)-1]);
        }
        else
        {
            String s1 = "" + s.charAt(0);
            int b=Integer.parseInt(s1);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == (b * 10)) {
                    System.out.print(str[i]);
                }
            }
            s1 = "" + s.charAt(1);
            int a = Integer.parseInt(s1);
            if (a != 0)
            {
                System.out.print(str[a%10-1]);
            }
        }
    }
    static void three(String s)
    {
        String s1=""+s.charAt(0);
        if(Integer.parseInt(s1)!=0)
        {
            System.out.print(str[Integer.parseInt(s1)-1]+" Hundred ");
        }
        s1="";
        s1=s1+s.charAt(1);
        s1=s1+s.charAt(2);
        two(s1);
    }
    static void four(String s)
    {
        String s1=""+s.charAt(0);
        int a=Integer.parseInt(s1);
        System.out.print(str[a-1]+" Thousand ");
        s1="";
        s1+=s.charAt(1);
        s1+=s.charAt(2);
        s1+=s.charAt(3);
        three(s1);
    }
    static void five(String s)
    {
        String s1="";
        s1+=s.charAt(0);
        s1+=s.charAt(1);
        two(s1);
        System.out.print(" Thousand ");
        s1="";
        s1+=s.charAt(2);
        s1+=s.charAt(3);
        s1+=s.charAt(4);
        three(s1);
    }
}