package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            int n = Integer.parseInt(reader.readLine());
            num[i] = n;
            if (n > maximum) maximum = n;
            if (n < minimum) minimum = n;
        }

        System.out.print(maximum + " ");
        System.out.println(minimum);
    }
}
