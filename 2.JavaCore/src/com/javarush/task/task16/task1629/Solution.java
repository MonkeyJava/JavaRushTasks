package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        String str;
        String str1;
        String str2;
        @Override
        public void run() {

            try {
                str = Solution.reader.readLine();
                str1 = Solution.reader.readLine();
                str2 = Solution.reader.readLine();
            } catch (IOException e) {
                e.getMessage();
            }
        }
        public void printResult() {
            System.out.print(str + " " + str1 + " " + str2);
            System.out.println();
        }

}    //add your code here - добавьте код тут
}
