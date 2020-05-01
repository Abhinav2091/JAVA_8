package com.luv2code.model;

public class Student {
    public String name;
    public int no;

    public Student(String name,int no)
    {
        this.name=name;
        this.no=no;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
