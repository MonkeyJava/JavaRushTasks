package com.javarush.task.task15.task1522;

/*
Закрепляем Singleton pattern
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    static { readKeyFromConsoleAndInitPlanet();} //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        String str = null;
       try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            str = reader.readLine(); // implement step #5 here - реализуйте задание №5 тут

       } catch (IOException e){ e.getMessage(); }
        if ("sun".equals(str)) { thePlanet =  Sun.getInstance(); }
        else if ("moon".equals(str)) { thePlanet =  Moon.getInstance(); }
        else if ("earth".equals(str)) { thePlanet =  Earth.getInstance(); }
        else {
            thePlanet = null;
        }
    }
}
