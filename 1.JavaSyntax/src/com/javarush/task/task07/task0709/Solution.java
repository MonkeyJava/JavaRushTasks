package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Выражаемся покороче
*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        for (String str : list){
            if (str.length() < min) min = str.length();
        }
        for (String string : list){
            if (string.length() == min) System.out.println(string);
        }

    }
}
