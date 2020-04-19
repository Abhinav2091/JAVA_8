package com.luv2code.model;

public class Employee {
    public int eNo;
    public String eName;

    public Employee(int eNO,String eName)
    {
this.eNo=eNO;
this.eName=eName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eNo=" + eNo +
                ", eName='" + eName + '\'' +
                '}';
    }
}
