package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        FileInputStream fis;
        while (true){
                str = reader.readLine();
            try {
        fis = new FileInputStream(str);
                fis.close();
        } catch (FileNotFoundException e) {
          //  e.printStackTrace();
                break;
        }
        }
        System.out.println(str);

    }
}
