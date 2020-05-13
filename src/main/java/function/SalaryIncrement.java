package function;

import com.sun.org.apache.xpath.internal.compiler.FunctionTable;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncrement {
    public static void main(String ar[]) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        populateList(list);
        System.out.println("********Salary of Emplyees Before Increment********");
        System.out.println(list);
        Predicate<Employee> p = e->e.salary<35000;
        Function<Employee,Employee> f = e->{
            e.salary=e.salary+500;
            return e;
        };
        System.out.println("*******After Increment*********");
        ArrayList<Employee> newList = new ArrayList<Employee>();
        for(Employee e : list) {
            if(p.test(e)) {
                newList.add(f.apply(e));
            }
        }
        System.out.println(list);
        System.out.println("*******Employees with Incremented Salary********");
        System.out.println(newList);
    }
    public static void populateList(ArrayList<Employee> list) {
        list.add(new Employee("Robin",23000));
        list.add(new Employee("Ronney",30000));
        list.add(new Employee("Akhil",35000));
        list.add(new Employee("Ankush",43000));
        list.add(new Employee("Rompy",53000));
    }
}
