package com.luv2code.java8Feature;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.time.*;
import java.util.Arrays;

public class DateTimeAPIMainClass {
    public static void main(String ar[])
    {
        //print current Date of system
        LocalDate date = LocalDate.now();
        System.out.println("Current Dte :"+date);
        //print current Time of system
        LocalTime time = LocalTime.now();
        System.out.println("Current Time"+time);

        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yyyy=date.getYear();
        System.out.printf("%d-%d-%d ",dd,mm,yyyy);
        int hour=time.getHour();
        int min=time.getMinute();
        int sec=time.getSecond();
        int nenoSec=time.getNano();
        System.out.printf("%d-%d-%d-%d\n",hour,min,sec,nenoSec);

        //both Date and Time can use same above methods
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("Current Date and Time:"+dateTime);

        //get particular date time
        LocalDateTime dt=LocalDateTime.of(1993, Month.OCTOBER,10,12,12);
        System.out.println("dt::"+dt);

        System.out.println("before 6months date"+dt.minusMonths(6));
        System.out.println("After 6min date"+dt.plusMinutes(6));

        //find my Age
        LocalDate birthyear=LocalDate.of(1993,10,10);
        LocalDate today=LocalDate.now();
        Period myAge=Period.between(birthyear,today);
        System.out.println("My age::"+myAge);
        System.out.printf("Age is %d Year %d Month %d days \n",myAge.getYears(),myAge.getMonths(),myAge.getDays());

        //my experience
        LocalDate expJoiningDate=LocalDate.of(2017,Month.JULY,3);
        Period exp=Period.between(expJoiningDate,today);
        System.out.printf("Exp is %d Year %d Month %d days\n",exp.getYears(),exp.getMonths(),exp.getDays());

        //find leap year
        //it must be divisable by 4 to be leap year
        //if its centurey year i.e divisible by 100
        //then it has to to be divisble by 400 to be leap yaer
        Year year=Year.of(2016);
        if(year.isLeap())
            System.out.println("Year is leap");
        else
            System.out.println("Year is not leap");

        //fine zone of my system
        ZoneId zone=ZoneId.systemDefault();
        System.out.println("Current Zone:"+zone);

        //create a zone
        ZoneId la=ZoneId.of("America/Los_Angeles");//need to be proper zone of
        ZonedDateTime zdt=ZonedDateTime.now(la);
        System.out.println("print the zone I created::"+zdt);





    }
}
