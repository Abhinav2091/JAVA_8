package employeeApplication;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MainEmployee {
    public static void main(String ar[]) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        populateList(list);
        Predicate<Employee> p = emp->emp.desig.equals("Manager");
        System.out.println("Managers :");
        display(p,list);
        Predicate<Employee> noida = emp->emp.city.equals("Noida");
        System.out.println("Noida Employees :   ");
        display(noida,list);
        Predicate<Employee> pink = emp->emp.city.equals("Goa");
        System.out.println("Managers from Goa :");
        display(p.and(pink),list);
        System.out.println("EMployees who are not Managers :");
        display(p.negate(),list);
        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Ronney","CEO",250000,"Mumbai"));
        Employee e = new Employee("Ronney","CEO",250000,"Mumbai");
        System.out.println(isCEO.test(e));
        System.out.println("**************************");


    }
    public static void populateList(ArrayList<Employee> list) {
        list.add(new Employee("Robin","SSE",26000,"Noida"));
        list.add(new Employee("Ronney","CEO",126000,"Noida"));
        list.add(new Employee("Akhil","SE",20000,"Delhi"));
        list.add(new Employee("Ankush","Manager",56000,"Kathua"));
        list.add(new Employee("Rompy","Manager",76000,"Goa"));
    }

    public static void display(Predicate<Employee> pr, ArrayList<Employee> al) {
        for(Employee e:al) {
            if(pr.test(e)) {
                System.out.println(e);
            }
        }
    }
}
