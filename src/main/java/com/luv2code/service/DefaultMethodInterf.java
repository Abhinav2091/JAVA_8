package com.luv2code.service;

public interface DefaultMethodInterf {
    default void defaultMethod()
    {
        System.out.println("Default Method");
    }

    default void ambigutyProb()
    {
        System.out.println("DefaultMethodInterf class");
    }
}
