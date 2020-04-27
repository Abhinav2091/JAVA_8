package com.luv2code.java8Feature;

import com.sun.javafx.scene.control.skin.IntegerFieldSkin;

import java.util.Date;
import java.util.function.*;

public class PrimitiveTypePreDefineFunctionalInterface {
    public static void main(String ar[])
    {

        //primitive Predicate
        primitivePredicate();
        //primitive Function
        primitiveFunction();
        // primitive BI Function
        primitiveBIFunction();
        //Primitive Consumer
        primitiveConsumer();
        //Primitive Supplier
        primitiveSupplier();
    }

    private static void primitiveSupplier() {
        IntSupplier intSupplier =()->(int)Math.random()*10;
        System.out.println("Int Supplier:"+intSupplier.getAsInt());
        LongSupplier longSupplier =()->123L;
        System.out.println("Long Supplier:"+longSupplier.getAsLong());
        DoubleSupplier doubleSupplier =()->Math.random()*10;
        System.out.println("Double Supplier:"+doubleSupplier.getAsDouble());
    }

    private static void primitiveConsumer() {
        IntConsumer c= i-> System.out.println(i*i);
        c.accept(10);
        LongConsumer l= i-> System.out.println(i*i);
        l.accept(10L);
        DoubleConsumer d= i-> System.out.println(i*i);
        d.accept(10D);
        //Primitive Bi Consumer with object
        ObjIntConsumer oI=(a,b)-> System.out.println("A:"+a+"B:"+b);
        oI.accept(10,1);
        ObjLongConsumer oL=(a,b)-> System.out.println("A:"+a+"B:"+b);
        oL.accept(new Date(), 10L);
        ObjDoubleConsumer oD=(a,b)-> System.out.println("A:"+a+"B:"+b);
        oD.accept(new String("Abhinav"),10D);
    }

    private static void primitiveBIFunction() {
        ToIntBiFunction<Integer,Integer> biFunction=(a, b)->a*b;
        System.out.println("To Int Bi Function:"+biFunction.applyAsInt(2,3));
        ToLongBiFunction<Integer,Integer> biFunction2=(a, b)->a*b;
        System.out.println("To Long Bi Function:"+biFunction2.applyAsLong(2,3));
        ToDoubleBiFunction<Integer,Integer> biFunction3=(a, b)->a*b;
        System.out.println("To Double Bi Function:"+biFunction3.applyAsDouble(2,3));
    }

    private static void primitiveFunction() {
        IntFunction<Integer> iFunction= s->s*s;
        System.out.println("Int Function"+iFunction.apply(3));
        ToIntFunction<String> f= s->s.length();
        System.out.println("To INt Function"+f.applyAsInt("Abhinav"));
        LongFunction<Long> lFunction = s -> s * s;
        System.out.println("Long Function"+lFunction.apply(3L));
        ToLongFunction<String> sFunction = s -> s.length();
        System.out.println("To Long  Function"+sFunction.applyAsLong("Abhinav"));
        DoubleFunction<Double> dFunction= s->s*s;
        System.out.println("Double Function"+dFunction.apply(3d));
        ToDoubleFunction<String> ddFunction=s->s.length();
        System.out.println("To Double Function"+ddFunction.applyAsDouble("String"));
    }

    private static void primitivePredicate() {
        IntPredicate iPredicate = s->s%2==0;
        System.out.println("Int Predicate:"+iPredicate.test(2));
        LongPredicate lPredicate = s->s%2==0;
        System.out.println("Int Predicate:"+lPredicate.test(3L));
        DoublePredicate dPredicate = s->s%2==0;
        System.out.println("Int Predicate:"+dPredicate.test(5d));
    }

}
