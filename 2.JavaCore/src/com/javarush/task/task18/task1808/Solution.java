package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();
        FileInputStream fis = new FileInputStream(str);

        FileOutputStream fos2 = new FileOutputStream(str2);
        FileOutputStream fos3 = new FileOutputStream(str3);
        byte[] buffer = new byte[fis.available()];
        int count = fis.read(buffer);
        int n;
        if (count % 2 == 0) {fos2.write(buffer, 0,n = count/2);}
        else  fos2.write(buffer, 0, n = count/2+1);
        for (int i = n; i < count; i++) {

            fos3.write(buffer[i]);
        }

        fis.close();
        fos2.close();
        fos3.close();
       // System.out.println(39%2);
    }
}
