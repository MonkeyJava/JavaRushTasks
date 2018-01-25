package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 1.2));  //напишите тут ваш код
        System.out.println(convertEurToUsd(100, 1.3));  //напишите тут ваш код
      }

    public static double convertEurToUsd(int eur, double course) {

        double dollars = eur * course;

        return dollars; //напишите тут ваш код
    }
}
