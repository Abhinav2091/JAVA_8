package com.luv2code.service;

public interface DefaultMethodInterfAmbigutyProb {
    default void ambigutyProb()
    {
        System.out.println("DefaultMethodInterfAmbigutyProb class");
    }
}
