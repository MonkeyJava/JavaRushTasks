package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);

        }
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() % 2 == 0){
                newList.add(list.get(i));
                newList.add(list.get(i));}
                else if(list.get(i).length() % 2 != 0){
                newList.add(list.get(i));
                newList.add(list.get(i));
                newList.add(list.get(i));
            }
        }
            for (String s : list) {
                for(String str : newList){
                if (str.equals(s)){
                    System.out.print(str + " ");
                    }
                }System.out.println();
            }

       /* ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }*/
    }
}
