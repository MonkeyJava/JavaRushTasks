package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        reader.close();
        FileWriter fileWriter = new FileWriter(s1);
        FileReader fileReader = new FileReader(s2);
        FileReader fileReader2 = new FileReader(s3);
        int data;
        while ((data = fileReader.read())!=-1){
            fileWriter.write(data);
        }
        while ((data = fileReader2.read())!=-1){
            fileWriter.write(data);
        }


            fileWriter.close();
        fileReader.close();
        fileReader2.close();
    }
}
