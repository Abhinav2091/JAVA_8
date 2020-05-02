package employeeApplication;

public class Employee {
    String name;
    String desig;
    float salary;
    String city;

    public Employee(String name, String desig, float salary, String city) {
        this.name = name;
        this.desig = desig;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        String s = String.format("[%s,%s,%.2f,%s]",name,desig,salary,city);
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee)obj;
        if(name.equals(e.name) && desig.equals(e.desig) && salary==e.salary && city.equals(e.city))
            return  true;
        else
            return false;
    }
}
