import java.util.*;
class a {
public static void main(String []args){

Scanner obj=new Scanner(System.in);

System.out.print("Enter A value-");
int a=obj.nextInt();

System.out.print("Enter B value-");
int b=obj.nextInt();

System.out.println(a+"+"+b+"="+(a+b));
System.out.println(a+"-"+b+"="+(a-b));
System.out.println(a+"*"+b+"="+(a*b));
System.out.println(a+"/"+b+"="+(a/b));
System.out.println(a+"%"+b+"="+(a%b));
}
}