package com.javarush.task.task14.task1408;

/**
 * Created by root on 21.02.17.
 */
public class BelarusianHen extends Hen {
   public int getCountOfEggsPerMonth(){
        return 25;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.BELARUS
        + ". Я несу "  + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
