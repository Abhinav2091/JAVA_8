package lamdaCode;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeLamda {
    public static void main(String ar[]) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(100,"Ronney"));
        al.add(new Employee(500,"Singh"));
        al.add(new Employee(200,"Akhil"));
        al.add(new Employee(300,"Ankush"));
        System.out.println("List : "+al);
        Collections.sort(al,(e1,e2)->(e1.empNo>e2.empNo)?-1:(e1.empNo<e2.empNo)?1:0);
        System.out.println("Sorted List : "+al);
    }
}
