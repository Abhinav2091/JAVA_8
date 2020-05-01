package com.luv2code.java8Feature;

import com.luv2code.model.Student;
import com.luv2code.service.HelloWorld;
import com.luv2code.service.ReturnStudentobject;
import com.luv2code.service.StringLength;

public class DoubleColonOperaterMainClass {
    public static void main(String ar[])
    {
        //Method Reference
        //methodReference();

        //Constructor Reference
       // only work for no arg constructor
        //not able to use it with parametrise const
        ReturnStudentobject student=Student::new;

    }

    private static void methodReference() {
        //static method reference
        HelloWorld helloWorld= DoubleColonOperaterMainClass::testMethod;
        helloWorld.helloMethod();

        //non static method reference
        DoubleColonOperaterMainClass doubleColonOperaterMainClass=new DoubleColonOperaterMainClass();
        HelloWorld helloWorldns=doubleColonOperaterMainClass::test;
        helloWorldns.helloMethod();

        //method reference with param
        StringLength stringLength =doubleColonOperaterMainClass::StringLegth;
        System.out.println("length of String with method Ref:"+stringLength.lengthOfString("Aju"));

        //Thread Implementation with Method Referance
        Runnable runnable=doubleColonOperaterMainClass::runImplementation;
        Thread thread=new Thread(runnable);
        thread.start();
        for(int i=0;i<40;i++) {
            System.out.println("Main Thread");
        }
    }

    //Static method that need to refer
    public static void testMethod()
    {
        System.out.println("Static Test method Reference");
    }
    //non static method reference
    public void test()
    {
        System.out.println("Non Static Test method Reference");
    }

    public int StringLegth(String s)
    {
        return s.length();
    }
    public void runImplementation()
    {
        for(int i=0;i<40;i++)
        {
            System.out.println("Child thread");
        }
    }
}
