package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        double i = 0;
        double m = 0;
        double res;
        while (true){
            n = Integer.parseInt(reader.readLine());
            if (n==-1){break;}
            i = i + n;
            m++;
        }
        res = i/m;
        System.out.println(res);
    }
}

