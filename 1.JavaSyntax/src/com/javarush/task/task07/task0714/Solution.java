package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/*
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            String str = reader.readLine();
            list.add(str);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == 2) list.remove(2);
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}


