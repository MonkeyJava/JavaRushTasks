package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis;
        while (true) {
            String str = reader.readLine();
            fis = new FileInputStream(str);
            if (fis.available() < 1000) {
                fis.close();
                throw new DownloadException();
            }
            while (fis.available() > 0){
            int data = fis.read();
               // System.out.println(data);
                }

        }

    }

    public static class DownloadException extends Exception {

    }
}
