package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker drinkMaker = new LatteMaker();
        drinkMaker.makeDrink();
        DrinkMaker drinkMaker2 = new TeaMaker();
        drinkMaker2.makeDrink();
    }
}
