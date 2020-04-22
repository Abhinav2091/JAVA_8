package com.luv2code.lambda;


import com.luv2code.model.Employee;
import com.luv2code.service.HelloWorld;
import com.luv2code.service.StringLength;
import com.luv2code.service.SumInterface;
import com.luv2code.service.ThisVariableExample;

import java.util.*;

public class LambdaMainClass {
    int x=888;

    public static void main(String ar[]) {
        hellomethod();
        sum();

        lengthOfString();

        //this variable example
        //local variable is final in Lambda
        LambdaMainClass lambdaMainClass =new LambdaMainClass();
        lambdaMainClass.anonymousInnerClass();



        //lambda expression which implements runnable interface
        runnableInterface();

        //Comparator with Lambda
        sorthingList();

        //Tree Set
        treeSetSorting();

        //Tree Map
        treeMapSorting();

        //own class Sorting
        employeeClassSorting();


    }

    private static void employeeClassSorting() {
        List<Employee> alEmployee=new ArrayList<Employee>();
        alEmployee.add(new Employee(10,"Ajay"));
        alEmployee.add(new Employee(2,"Ram"));
        alEmployee.add(new Employee(5,"Suji"));
        alEmployee.add(new Employee(20,"Raju"));

        Collections.sort(alEmployee,(e1, e2)->(e1.eNo<e2.eNo)?-1:(e1.eNo>e2.eNo)?+1:0);
        System.out.println("Employee class Sorting::"+alEmployee);
    }

    private static void treeMapSorting() {
        //default sorting order
        //Map<Integer,String> tm = new TreeMap<>();
        //by passing comparator
        Map<Integer,String> tm = new TreeMap<>((I1, I2)->(I1>I2)?-1:(I1<I2)?+1:0);
        tm.put(5,"Abhi");
        tm.put(3,"Aju");
        tm.put(10,"Abhinav");
        tm.put(9,"Himanshu");
        tm.put(19,"Uttam");
        System.out.println("Tree map sorting: "+tm);
    }

    private static void treeSetSorting() {
        //default sorting
        //Set<Integer> s =new TreeSet<>();
        //customise sorting
        Set<Integer> s =new TreeSet<>((I1, I2)->(I1>I2)?-1:(I1<I2)?+1:0);

        s.add(10);
        s.add(1);
        s.add(7);
        s.add(11);
        s.add(50);
        System.out.println("tree set sorting: "+s);
    }

    private static void sorthingList() {
        List<Integer> l =new ArrayList<>();
        l.add(10);
        l.add(1);
        l.add(7);
        l.add(11);
        l.add(50);
        //without lambda
        //Collections.sort(l,new MyComparator());
        //with lambda
        Collections.sort(l,(I1, I2)->(I1>I2)?-1:(I1<I2)?+1:0);
        System.out.println(l);
    }
    //Also using as anonymous Inner Class
    private static void runnableInterface() {
        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");

            }
        };
//one way
        Thread t = new Thread(r);
        t.start();
        //other way
        Thread t1= new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Lambda Child Thread");

            }
        });
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");

        }
    }

    private static void lengthOfString() {
        StringLength stringLength = s ->
                s.length();
        System.out.println(stringLength.lengthOfString("Hello world"));
    }

    //lambda expression for sum
    private static void sum() {
        SumInterface sumInterface = (a, b) ->
                System.out.println("Sum is :" + (a + b));

        sumInterface.add(10, 20);
        sumInterface.add(100, 200);
    }

    //lambda expression for simple print
    private static void hellomethod() {
        HelloWorld helloWorld = () ->
                System.out.println("Hello World");
        helloWorld.helloMethod();
    }

    private void anonymousInnerClass()
    {
        //Local Variable of method
        String t="test";
        //with Anonymous Inner Class

        ThisVariableExample thisVariableExample = new ThisVariableExample(){
            int x=999;

            public void m1(){
                System.out.println("This variable with Anonymous Inner class: "+this.x);
            };
        };
        thisVariableExample.m1();

        //with Lambda Expression
        ThisVariableExample lthisVariableExample = ()->{
            int x=999;
            //t="hello";//are effectively final
            System.out.println("This variable with Lambda: "+this.x);
        };
        lthisVariableExample.m1();
    }
}
