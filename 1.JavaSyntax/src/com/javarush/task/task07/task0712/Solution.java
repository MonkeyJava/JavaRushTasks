package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int maxStr = 0;
        int minStr = Integer.MAX_VALUE;
               for (String aList : list) {
                   if (aList.length() > maxStr) {
                maxStr = aList.length();
            }
                   if (aList.length() < minStr) {
                minStr = aList.length();
            }
        }

            int indexMax = 0;
            int indexMin = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).length() == maxStr) { indexMax = j; break;}


            }
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).length() == minStr) { indexMin = j; break;}
        }

        int result = indexMax > indexMin ? indexMin:indexMax;

            System.out.println(list.get(result));


 }
}

