package AccModifiers;
import java.util.Scanner;
public class NewClass
{
   static Scanner sc=new Scanner(System.in);
   public int m1(float a)
   {
	System.out.println("Public Method M1");
	return sc.nextInt();
   }
   static float m2(int a)
   {
	System.out.println("Default Method M2");
	return sc.nextFloat();
   }
   protected void m3()
   {
	System.out.println("Protected M3 Method");
   }
   private float b=sc.nextFloat();
}