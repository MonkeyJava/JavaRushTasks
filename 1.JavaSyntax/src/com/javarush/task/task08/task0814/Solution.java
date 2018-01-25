package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
       HashSet <Integer> set = new HashSet<>();//напишите тут ваш код
        for (int i = 0; i < 20; i++) {
        set.add(i);
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator it = set.iterator();
        while (it.hasNext()){
           int n = (int) it.next();
            if (n > 10) it.remove();
        }
        return set;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
       // System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}
