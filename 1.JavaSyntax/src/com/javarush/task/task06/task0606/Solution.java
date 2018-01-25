package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        // int s = (num % 2) == 0 ? even++ : odd++;
        int i = 1;
        if (((num / i) % 2) == 0) even++;
        else odd++;
            int s = 1;
        for (int j = 0; j < String.valueOf(num).length() - 1; j++) {
            s *= i * 10;

            if (((num / s) % 2) == 0)   even++;
        else odd++;
        }
        /*if ((num / 100) % 2  == 0) even++;
        else odd++;
        if ((num / 1000) % 2  == 0) even++;
        else odd++; */
        System.out.println("Even: " + even + " " + "Odd: " + odd);
        //System.out.println(s); //напишите тут ваш код
    }
}
