package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        String str;
        for (int i = 0; i < 10; i++) {
            str = reader.readLine();
            list.add(str);
        }

        for (int k = 0; k < list.size(); k++) {
            if (list.get(k).length() > n) {
                n = list.get(k).length();
            }
            else if(list.get(k).length() < n) {
                System.out.println(k);
            break;
            }
        }

    }
}

