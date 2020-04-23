package com.luv2code.java8Feature;

import com.luv2code.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredefineFunctionalInterfaceMainClass {
    public static void main(String ar[]) {
        //predicate Functional Interface
        Predicate<Integer> pI = I -> I > 10;
        Predicate<String> pS = S -> S.length() > 10;
        Predicate<Collection> pC = C -> C.isEmpty();
        List<String> lS = new ArrayList<String>();
        System.out.println(pI.test(2));
        System.out.println(pS.test("ABHINAVSHARMA"));
        System.out.println(pC.test(lS));
        lS.add("Abhinav");
        System.out.println(pC.test(lS));

        //default method of Predicate Interface Predicate Joining.
        Predicate<Integer> p1 = I -> I > 10;//I must be greater than 10
        Predicate<Integer> p2 = I -> I % 2 == 0;//I is even  or not
        Predicate<Integer> p3 = I -> I == 12;//test only
        System.out.println("Number is greater than 10:" + p1.test(4));
        System.out.println("Number is even:" + p2.test(5));
        p1 = p1.and(p2).and(p3);
        System.out.println("Number is Greater than 10 and is even and is equal to 12:" + p1.test(12));
        p1 = p1.or(p2);
        System.out.println("Number is either Greater than 10 or even:" + p1.test(4));
        p1 = p1.negate();
        System.out.println("Number is smaller than 10:" + p1.test(4));

        //some other predicate Example
        Predicate<String> pE = S -> S.startsWith("K");//Name starts with K
        //other way
        Predicate<String> pEE = S -> S.charAt(0) == 'K';
        System.out.println(pE.test("Knuj") + "::" + pEE.test("Ajay"));

        //remove empty value from String array
        String aS[] = {"Abhinav", "", "Ajay", null};
        Predicate<String> prC = S -> S != null && !S.isEmpty();
        for (String a : aS) {
            System.out.println(a + " is a Valid String:" + prC.test(a));
        }


        //Class Object Validation
        Predicate<Employee> prE = e -> e.eName.equalsIgnoreCase("ABC") && e.eNo == 1;
        Employee e = new Employee(1, "ABC");
        System.out.println("Valid User:" + prE.test(e));

        //static method of Predicate Interface
        Predicate<String> prEq = Predicate.isEqual("AJU");
        System.out.println("Static method of Predicate Interface::" + prEq.test("AJU"));


    }
}
