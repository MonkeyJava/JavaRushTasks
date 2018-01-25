package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> set = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        FileInputStream fis = new FileInputStream(str);
        int data;
        while (fis.available() > 0){
            data = fis.read();
            set.add(data);
        }
        for (Integer s : set){
            System.out.print(s + " ");
        }
        reader.close();
        fis.close();

    }
}
