package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String str2 = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(str));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(str2));
        int data;
        String s;
        while ((data = fileReader.read())!=-1){
            s = String.valueOf(data);

           if (isDigit(s))
           fileWriter.write(s + " ");
        }

        fileReader.close();
        fileWriter.close();
        System.out.print((char)116);

    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
