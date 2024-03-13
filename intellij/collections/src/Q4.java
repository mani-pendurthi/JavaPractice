import java.util.ArrayList;
import java.util.Scanner;

class Employee
{
    String name;
    int id;
    double salary;
    String desig;
    Employee(String name,int id,double salary,String desig)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.desig=desig;
    }
    /*String getName()
    {
        return name;
    }
    int getId()
    {
        return id;
    }
    double getSalary()
    {
        return salary;
    }
    String getDesig()
    {
        return desig;
    }*/

}
public class Q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        Employee obj1=new Employee(sc.next(),sc.nextInt(),sc.nextDouble(),sc.next());
        Employee obj2=new Employee(sc.next(),sc.nextInt(),sc.nextDouble(),sc.next());
        Employee obj3=new Employee(sc.next(),sc.nextInt(),sc.nextDouble(),sc.next());
        Employee obj4=new Employee(sc.next(),sc.nextInt(),sc.nextDouble(),sc.next());
        Employee obj5=new Employee(sc.next(),sc.nextInt(),sc.nextDouble(),sc.next());
        ArrayList<Employee> Al=new ArrayList<>();
        Al.add(obj1);
        Al.add(obj2);
        Al.add(obj3);
        Al.add(obj4);
        Al.add(obj5);

        for(Employee a:Al)
        {
            System.out.println(a.name);
            System.out.println(a.id);
            System.out.println(a.salary);
            System.out.println(a.desig);
        }
    }
}
