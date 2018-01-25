package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUl", "AUG", "SEP", "OKT", "NOV", "DEC"};
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.getMonths();

        Date date = new Date(str);   //напишите тут ваш код
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy", dateFormatSymbols);
        System.out.println(simpleDateFormat.format(date));



    }

}


