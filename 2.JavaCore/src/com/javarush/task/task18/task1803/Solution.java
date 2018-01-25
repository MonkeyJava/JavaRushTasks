package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        FileInputStream fis = new FileInputStream(str);
        List<Integer> list = new ArrayList<>();
        int data;
        //int count = 0;
        int max = 0;
        int n;
        int m = 0;
        while (fis.available() > 0) {
            data = fis.read();
            list.add(data);
           n = Collections.frequency(list, data);
            if(n > max) {max = n; m = data;}
            if (max == n){System.out.print(m + " ");}
          //  System.out.print(n + "-");
        }
        //System.out.println("Max: " + n + " - " + m);
        System.out.println();
        for(Integer i : list){
          //  System.out.println();
            System.out.print(i + " ");
        }
        reader.close();
        fis.close();
    }
}
