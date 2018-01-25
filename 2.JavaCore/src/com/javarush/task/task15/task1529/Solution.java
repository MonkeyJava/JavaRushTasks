package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
       reset(); //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() {
       BufferedReader reader = null; //add your code here - добавьте код тут
        String str = "";
        int num = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
             str = reader.readLine();
            if ("plane".equals(str)){num = Integer.parseInt(reader.readLine());}
        } catch (IOException e){e.getMessage();}
        finally {
            try {
                if (reader != null){
                reader.close();}
            } catch (IOException e){e.getMessage();}
        }
        if ("helicopter".equals(str)) {result = new Helicopter();}
        else if ("plane".equals(str)) {result = new Plane(num);}
    }
}
