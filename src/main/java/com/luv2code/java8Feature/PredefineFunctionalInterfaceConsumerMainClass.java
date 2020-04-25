package com.luv2code.java8Feature;

import com.luv2code.model.Student;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredefineFunctionalInterfaceConsumerMainClass {

    public static void main(String ar[])
    {
        Consumer<String> cS=s-> System.out.println(s);
        //simple printiing Consumer pass Value
        cS.accept("Abhinav");

        //Example to use all three Predifine Functional Interface
        //predicate to check if Student number is Greater that 60
        Student obj =new Student("Abhinav",50);
        Predicate<Student> pStudent=s->s.no>60;
        pStudent.test(obj);
        //return the grade
        Function<Student,String> fStudent =s-> {
            String result="";
            if(s.no>60)
                result= "A";
            else
                result= "B";
            return result;
        };
        // display Student with Grade
        Consumer<Student> cStudent =s->
        {
            System.out.println(s.toString()+":Grade:"+fStudent.apply(s));
        };

        //now use all of them here
        if(pStudent.test(obj))
        {
            cStudent.accept(obj);
        }

        //Consumer Chaining
        Consumer<Student> cS1=s-> System.out.println("Printing Value:"+s.toString());
        Consumer<Student> cS2=s-> System.out.println("printing Name:"+s.name);
        Consumer<Student> cS3=s-> System.out.println("printing no:"+s.no);
        cS1.andThen(cS2).andThen(cS3).accept(obj);


    }

}
