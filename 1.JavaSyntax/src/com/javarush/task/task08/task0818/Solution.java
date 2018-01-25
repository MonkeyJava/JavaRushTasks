package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
      HashMap<String, Integer> map = new HashMap<>();  //напишите тут ваш код
        map.put("Novopashin", 10000);
        map.put("Petrov", 400);
        map.put("Ivanov", 700);
        map.put("Lomonosov", 80);
        map.put("Zaharov", 180);
        map.put("Zorro", 780);
        map.put("BruceLee", 980);
        map.put("Stalone", 380);
        map.put("Putin", 500);
        map.put("Morozov", 380);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
      // HashMap<String, Integer> hashMap = new HashMap<>(map);
        Iterator<HashMap.Entry<String, Integer>> iterator = map.entrySet().iterator(); //напишите тут ваш код
        while (iterator.hasNext()){
            if (iterator.next().getValue() < 500) iterator.remove();
        }
       // for (Map.Entry<String, Integer> pair : map.entrySet()){
         //   System.out.println(pair.getKey()  + " : " + pair.getValue());
        //}
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}