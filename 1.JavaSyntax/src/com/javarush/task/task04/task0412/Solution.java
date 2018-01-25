package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  //напишите тут ваш код
        String str = reader.readLine();
        int num = Integer.parseInt(str);
        if (num > 0) {
            num = num * 2;
            System.out.println(num);
        }else if (num < 0) {
            num = num + 1;
            System.out.println(num);
        }else if (num == 0) {
            num = 0;
            System.out.println(num);
        }

    }

}