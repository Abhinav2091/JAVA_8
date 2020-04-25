package com.luv2code.java8Feature;

import javax.sound.midi.Soundbank;
import java.util.Date;
import java.util.function.Supplier;

public class PredefineFunctionalInterfaceSupplierMainClass {
    public static void main(String ar[]) {
        // get current date Supplier
        Supplier<Date> sDate = () -> new Date();
        System.out.println("Supplier for Current Date: " + sDate.get());

        //generate randome number OTP
        Supplier<String> sOTP = () ->
        {
            String otp = "";
            for (int i = 0; i < 4; i++) {//Math.randome generate randome number between 0to.9999
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println("OTP::" + sOTP.get());

        //generate Randome password
        //length should be 8 char
        //char At 2,4,6,8 place only digit
        //char At 1,3,5,7 only Uppercase Alphabet or special char
        Supplier<String> sPass = () ->
        {//sub supplier for number
            Supplier<Integer> no = () -> {
                return (int) (Math.random() * 10);
            };
            //sub supplier for char
            String ran = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Character> sChar = () -> {
                return ran.charAt((int) (Math.random() * 29));//it will generate 1-28 val only
            };
            String pass = "";
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    pass = pass + sChar.get();
                } else {
                    pass = pass + no.get();
                }
            }
            return pass;
        };
        System.out.println("Random Password::" + sPass.get());
    }

    //
}
