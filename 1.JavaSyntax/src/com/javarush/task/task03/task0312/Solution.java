package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код

    public static int convertToSeconds(int hour){
        int seconds = hour * 3600;
        return seconds;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(1)); //напишите тут ваш код
        System.out.println(convertToSeconds(2)); //напишите тут ваш код
    }
}
