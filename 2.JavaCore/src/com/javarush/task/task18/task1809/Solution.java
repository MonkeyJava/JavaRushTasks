package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        String str2 = reader.readLine();
        FileInputStream fis = new FileInputStream(str);
        FileOutputStream fos = new FileOutputStream(str2);
        byte[] buffer = new byte[fis.available()];
        int count = fis.read(buffer);
        for (byte b = 0; b < buffer.length/2; b++){
           // buffer[b] = buffer[buffer.length-1-b];
            byte tmp = buffer[b];
            buffer[b] = buffer[buffer.length-b-1];
            buffer[buffer.length-b-1] = tmp;
        }

        fos.write(buffer, 0, count);
        reader.close();
        fis.close();
        fos.close();

    }
}
