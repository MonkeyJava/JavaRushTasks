package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        String str;
        while (i < 10){
            str = reader.readLine();
            list.add(str);
            i++;
        }
        // Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> result = doubleValues(list);
        for(String s : result){
            System.out.println(s);
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 2; j++) {
            list1.add(list.get(i));}
        } //напишите тут ваш код
        return list1;
    }
}
