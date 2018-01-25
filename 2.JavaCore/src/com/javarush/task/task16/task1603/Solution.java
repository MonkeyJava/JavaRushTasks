package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {

        SpecialThread sp = new SpecialThread();
        Thread thread = new Thread(sp);
        SpecialThread sp1 = new SpecialThread();
        Thread thread1 = new Thread(sp1);
        SpecialThread sp2 = new SpecialThread();
        Thread thread2 = new Thread(sp2);
        SpecialThread sp3 = new SpecialThread();
        Thread thread3 = new Thread(sp3);
        SpecialThread sp4 = new SpecialThread();
        Thread thread4 = new Thread(sp4);
       list.add(thread);
       list.add(thread1);
       list.add(thread2);
       list.add(thread3);
       list.add(thread4);
        thread.start(); //Add your code here - добавьте свой код тут
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
