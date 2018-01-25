package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(reader.readLine());
        if (n < 0) a++;
            else if (n > 0) b++;
        }
        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);
    }
}
