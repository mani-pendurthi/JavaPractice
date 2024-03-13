import java.util.*;

class A {

public static void main (String []args){
	Scanner obj=new Scanner (System.in);

	System.out.print("Enter A value-");
	int a=obj.nextInt();
	System.out.print("Enter B value-");
	int b=obj.nextInt();
	System.out.print("Enter C value-");
	int c=obj.nextInt();
	
	  if(a>b && a>c) {
		System.out.print("A is greater-"+a);
	}
	 else if(b>c && b>a) {
		System.out.print("B is greater-"+b);
	}
	else {
		System.out.print("C is greater-"+c);
	}
}
}
