package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(str);
        BufferedReader br = new BufferedReader(fileReader);

       String s;
       int count = 0;
        List<String> list = new ArrayList<>();
        while ((s = br.readLine()) != null){

            list.add(s.replaceAll("[^a-zA-Z^ ]", ""));

        }
        for(String s1: list){
            for(String s2: s1.split(" ")){
                if(s2.equals("world"))
                    count++;
            }
        }

        System.out.println(count);
        fileReader.close();
        br.close();
    }
}
