package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list32 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        String str;
        for (int i = 0; i < 20; i++) {
            str = reader.readLine();
            num = Integer.parseInt(str);
                    list.add(num);
        }
        for (Integer aList : list) {
            if (aList % 3 == 0 && aList % 2 == 0) {list3.add(aList); list2.add(aList);}
            else if (aList % 3 == 0) list3.add(aList);
            else if (aList % 2 == 0) list2.add(aList);
            else list32.add(aList);
        }
        printList(list3);
        printList(list2);
        printList(list32);
    }

    public static void printList(List<Integer> list) {
        for (Integer n : list) System.out.println(n);
        //напишите тут ваш код
    }
}
