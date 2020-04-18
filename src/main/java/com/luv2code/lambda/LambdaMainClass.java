package com.luv2code.lambda;


import com.luv2code.Impl.Interface;

public class LambdaMainClass {
    public static void main(String ar[]) {
        /*Interface inteface = () ->
            System.out.println("Hello World");
            inteface.helloMethod();
        */
        /*Interface inteface = (a, b) ->
                System.out.println("Sum is :" + (a + b));

        inteface.add(10, 20);
        inteface.add(100, 200);*/

        Interface inteface = s ->
                s.length();
        System.out.println(inteface.lengthOfString("Hello world"));

        //lambda expression which implements runnable interface
        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");

            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");

        }

    }
}
