package com.luv2code.java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMainClass {
   public static List<Integer> myArrayList()
    {
        List<Integer> lst=new ArrayList<Integer>();
        lst.add(0);lst.add(2);lst.add(5);lst.add(10);lst.add(15);lst.add(20);lst.add(25);lst.add(4);lst.add(0);
        return lst;
    }
    public static void main(String ar[])
    {
        //find even number with Stream
        evenNumber();
        //double my list element with stream
        mapStream();
        //Stream object with collect and count method
        streamObject();
        //Stream object with sorted method
        sortingStreamList();
        //Stream object with min and max method
        minMaxStreamMethod();
        //Stream object with forEach method
        //simple print every element in stream
        //using method reference
        myArrayList().stream().forEach(System.out::print);
        //Stream object with toArray method
        toArrayInStream();
        //Stream.of method
        streamOf();


    }

    private static void streamOf() {
        Stream<Integer> s=Stream.of(1,6,5,3,2,5,8,9,0);
        System.out.println();
        s.forEach(System.out::print);
    }

    private static void toArrayInStream() {
        Integer[] arg=myArrayList().stream().toArray(Integer[]::new);
        System.out.println();
        System.out.println("Array from list");
        for(Integer a:arg)
        {
            System.out.print(a);
        }
    }

    private static void minMaxStreamMethod() {
        int minValue=myArrayList().stream().min((a,b)->a.compareTo(b)).get();
        System.out.println("Min value with Stream"+minValue);
        int maxValue=myArrayList().stream().max((a,b)->a.compareTo(b)).get();
        System.out.println("Min value with Stream"+maxValue);
        //remember min and max value will be reversed in case of desc
    }

    private static void sortingStreamList() {
        List<Integer> l1=myArrayList().stream().sorted().collect(Collectors.toList());
        System.out.println("Defaulr sorting order:"+l1);
        //customised sorting order with comparater
        List<Integer> l2=myArrayList().stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Customise sorting order with comparater:"+l2);
    }

    private static void streamObject() {
        Stream s=myArrayList().stream();
        //process to to list using collect Method
        System.out.println("Simple printing stream as List:"+s.collect(Collectors.toList()));
        //find stream count either based on filter or map processing
        Stream s1=myArrayList().stream();
        System.out.println("printing stream count:"+s1.count());
    }

    private static void mapStream() {
        List<Integer> l1=myArrayList().stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Double list element :"+l1);
    }

    private static void evenNumber() {
        List<Integer> l1=myArrayList().stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even Number List by Stream:"+l1);
    }

}
