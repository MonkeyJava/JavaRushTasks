package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        FileInputStream fis = new FileInputStream(str);
       // System.out.println(fis.available());
        int max = 0;
        while (fis.available()>0){
            int data = fis.read();
            if (data > max) {max = data;}
        }
        System.out.println(max);
    reader.close();
        fis.close();
    }

}
