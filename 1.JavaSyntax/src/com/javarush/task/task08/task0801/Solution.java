package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        set.add("арбуз");//арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for(String s : set){
            System.out.println(s);
        }
    }
}
