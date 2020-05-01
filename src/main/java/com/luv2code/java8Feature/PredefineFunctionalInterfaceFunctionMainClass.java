package com.luv2code.java8Feature;

import com.luv2code.model.Employee;
import com.luv2code.model.Student;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.function.*;

public class PredefineFunctionalInterfaceFunctionMainClass {

    public static void main(String ar[]) {
        //Predefine Functional Interface Function
        FunctionInterfaceMethod();

        //BiFunction Functional Interface
        byFunctionMethod();

        //UnaryOperator
        unaryOperator();

        //BinaryOperator
        binaryOperator();


    }

    private static void binaryOperator() {
        BinaryOperator<String> biString=(s1, s2)->s1.concat(s2);
        System.out.println("BinaryOperator where all params are same:"+biString.apply("Abhinav","Sharma"));
        //primitive Binary Operator
        IntBinaryOperator bInt= (i, k)->i*k;
        System.out.println("Int Binary Operater::"+bInt.applyAsInt(1,3));
        LongBinaryOperator blong= (i, k)->i*k;
        System.out.println("long Binary Operater::"+blong.applyAsLong(35L,2L));
        DoubleBinaryOperator bDouble= (i, k)->(i+k)*Math.random();
        System.out.println("Double Binary Operater::"+bDouble.applyAsDouble(2,1));
    }

    private static void unaryOperator() {
        //if both input and output type is same
        UnaryOperator<String> uString= s->String.valueOf(s.length());
        System.out.println("Unaray Operator ::both are String::"+uString.apply("Abhinav"));
        //primitive Unary Operator
        IntUnaryOperator uInt= i->i*i;
        System.out.println("Int Unary Operater::"+uInt.applyAsInt(1));
        LongUnaryOperator ulong= i->i*i;
        System.out.println("long Unary Operater::"+ulong.applyAsLong(35L));
        DoubleUnaryOperator uDouble= i->i*Math.random();
        System.out.println("Double Unary Operater::"+uDouble.applyAsDouble(2));
    }

    private static void byFunctionMethod() {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println("Sum of two values:" + biFunction.apply(2, 3));

        //create Student object by taking Name and number
        BiFunction<String, Integer, Student> biStudent = (a, b) -> new Student(a, b);
        BiFunction<String, Integer, Student> biStudents = (a, b) -> new Student(a, b);
        System.out.println("Student Object" + biStudent.apply("Raju", 4).toString());
    }

    private static void FunctionInterfaceMethod() {
        //return length of String
        //String is Input Type  //Integer is Return Type
        Function<String, Integer> f = s -> s.length();
        System.out.println("Length of String:" + f.apply("AJU"));

        //return Square of number
        Function<Integer, Integer> fI = i -> i * i;
        System.out.println("Square of Number:" + fI.apply(5));

        //Remove Space from String
        Function<String, String> fS = s -> s.replaceAll(" ", "");
        System.out.println("Removed String from provided String::" + fS.apply("My Name Is Abhinav"));

        //count number of Spaces
        Function<String, Integer> fSs = s -> s.length() - s.replaceAll(" ", "").length();
        System.out.println("Number of Spaces in String:" + fSs.apply("My Name Is Abhinav"));

        // Student class Grade Condition
        Function<Student, String> fStudent = fs -> {
            int marks = fs.no;
            String resp = "";
            if (marks > 85)
                resp = "First";
            else if (marks > 75)
                resp = "Second";
            else if (marks > 45)
                resp = "Third";
            else if (marks < 35)
                resp = "Fail";
            return resp;

        };
        Predicate<Student> pS = s -> s.no < 35;
        List<Student> lS = listAddingForStudentClass();
        for (Student s : lS) {
            System.out.println(s.name + " is " + fStudent.apply(s) + " in exam");
            //also find the fail studen
            if (pS.test(s))
                System.out.println("Failed Student Name:" + s.name);

        }

        //default Methods of Function Interface
        Function<String, String> f1 = s -> s.toLowerCase();
        Function<String, String> f2 = s -> StringUtils.capitalize(s);

        System.out.println("Using andThen method of Function::" + f1.andThen(f2).apply("ABHINAV"));
        System.out.println("Using compose method of Function::" + f1.compose(f2).apply("ABHINAV"));

        //static Method Of Function
        //no much use
        Function<String, String> fId = Function.identity();
        System.out.println("Returning the Same Value:" + fId.apply("Test"));
    }

    private static List<Student> listAddingForStudentClass() {
        List<Student> lS = new ArrayList<Student>();
        lS.add(new Student("Abhi", 50));
        lS.add(new Student("Aju", 80));
        lS.add(new Student("Raju", 30));
        lS.add(new Student("Manu", 20));
        lS.add(new Student("Kanu", 90));
        lS.add(new Student("Tunu", 70));
        lS.add(new Student("Ounu", 55));
        lS.add(new Student("Sonu", 58));
        lS.add(new Student("Monu", 80));
        return lS;
    }
}
