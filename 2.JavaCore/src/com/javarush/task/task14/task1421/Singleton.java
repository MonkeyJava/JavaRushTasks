package com.javarush.task.task14.task1421;

/**
 * Created by root on 25.02.17.
 */
public class Singleton {
    private static Singleton instance;

   private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null) instance = new Singleton();
return instance;
    }
}
