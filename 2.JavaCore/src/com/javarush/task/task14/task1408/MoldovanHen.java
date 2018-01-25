package com.javarush.task.task14.task1408;

/**
 * Created by root on 21.02.17.
 */
public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 30;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA
                + ". Я несу "  + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
