package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] a = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
        int n = Integer.parseInt(reader.readLine());
            a[i] = n;
            if (i % 2 == 0){ even = even + n;}
            else if (i % 2 != 0) {odd = odd + n;}
        }
        String result = (even > odd)? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        //System.out.println(even);
        //System.out.println(odd);
        System.out.println(result);
    }
}
