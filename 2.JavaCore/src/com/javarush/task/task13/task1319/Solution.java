package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(s)));

        while (true) {
            String data = reader.readLine();
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            if (data.equals("exit")) break;
        }
        bufferedWriter.flush();
        bufferedWriter.close(); // напишите тут ваш код
    }
}
