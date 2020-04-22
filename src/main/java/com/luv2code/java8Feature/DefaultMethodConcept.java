package com.luv2code.java8Feature;

import com.luv2code.service.DefaultMethodInterf;
import com.luv2code.service.DefaultMethodInterfAmbigutyProb;
import com.luv2code.service.StaticMethodOfInterface;

public class DefaultMethodConcept implements DefaultMethodInterf,DefaultMethodInterfAmbigutyProb, StaticMethodOfInterface {


    public static void main(String ar[])
    {    DefaultMethodConcept defaultMethodConcept = new DefaultMethodConcept();
    //either use Default method or OvverRidden Method
    defaultMethodConcept.defaultMethod();

        //ambiguty prob will occur
        //0can solve it by ovverriding it
        defaultMethodConcept.ambigutyProb();

        //static method of Interface
        //defaultMethodConcept.staticMethod();//error
        //DefaultMethodConcept.staticMethod();//error
        //Only way to call interface Static method
        StaticMethodOfInterface.staticMethod();

}
    @Override
    public void defaultMethod()
    {
        System.out.println("Overriden Method");
    }

    @Override
    public void ambigutyProb() {
        System.out.println("Ambiguty ovverridden Method");
        //or other ways
        DefaultMethodInterf.super.ambigutyProb();
        DefaultMethodInterfAmbigutyProb.super.ambigutyProb();
    }

}
