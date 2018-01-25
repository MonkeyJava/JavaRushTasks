package com.javarush.task.task14.task1417;

/**
 * Created by root on 25.02.17.
 */
public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "RUB";
    }
}
