package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strIn = reader.readLine();
        String strOut = reader.readLine();
        reader.close();
        FileReader fr = new FileReader(strIn);
        FileWriter fw = new FileWriter(strOut);
        int data;
        ArrayList<Integer> list = new ArrayList<>();
        while ((data = fr.read()) != -1){
            list.add(data);

           // fw.write(data);
        }

        for (int i = 1; i < list.size(); i= i+2) {
           fw.write(list.get(i));
        }

        fr.close();
        fw.flush();
        fw.close();
    }
}
