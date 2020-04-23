package com.luv2code.service;

import java.util.Comparator;

public abstract class MyComparator implements Comparator<Integer> {

    public int compare(Integer I1,Integer I2)
    {
        return((I1>I2)?-1:(I1<I2)?+1:0);
    }

}
