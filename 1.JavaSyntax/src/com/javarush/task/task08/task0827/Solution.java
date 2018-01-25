package com.javarush.task.task08.task0827;

/*
Работа с датой
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
     //   System.out.println(isDateOdd("JANUARY 1 2000"));
     //   System.out.println(isDateOdd("JANUARY 2 2020"));

    }

    public static boolean isDateOdd(String date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date(date));
        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;

    }
}
