import java.util.Scanner;

public class calender
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date in YYYY-MM-DD");
        String s=sc.nextLine();
        String s1[]=s.split("-");
        int year=Integer.parseInt(s1[0]);
        int month=Integer.parseInt(s1[1]);
        int day=Integer.parseInt(s1[2]);
        int year1=year;
        year=year-1;
        month=month-1;
        int sum=year;

        sum+=(year/400);
        sum+=(year/4);
        sum-=(year/100);
        year=sum%7;
        sum=0;
        switch(month-1)
        {
            case 11:sum+=30;
            case 10:sum+=31;
            case 9:sum+=30;
            case 8:sum+=31;
            case 7:sum+=31;
            case 6:sum+=30;
            case 5:sum+=31;
            case 4:sum+=30;
            case 3:sum+=31;
            case 2:if(year1%4==0 || year1%400==0 && year1%100!=0)
            {
                sum+=29;
            }
                sum+=28;
            case 1:sum+=31;
        }
        month=sum%7;
        sum=(year+month+day)%7;
        switch(sum)
        {
            case 0:System.out.print("Sunday");
                break;
            case 1:System.out.print("Monday");
                break;
            case 2:System.out.print("Tuesday");
                break;
            case 3:System.out.print("Wednesday");
                break;
            case 4:System.out.print("Thursday");
                break;
            case 5:System.out.print("Friday");
                break;
            case 6:System.out.print("Saturday");
                break;
        }
    }
}
