package com.javarush.task.task14.task1417;

/**
 * Created by root on 25.02.17.
 */
class Hrivna extends Money {

    public Hrivna(double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "HRN";
    }
}
