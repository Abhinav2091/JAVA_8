package lamdaCode;

public class Employee {
    int empNo;
    String empName;
Employee(int empNo, String empName) {
    this.empNo=empNo;
    this.empName=empName;
}
public String toString() {
    return empNo+":"+empName;
}
}
