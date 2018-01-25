package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов","Иван");
        map.put("Петров","Петр");
        map.put("Сидоров","Сидр");
        map.put("Курочкин","Андрей");
        map.put("Плотников","Андрей");
        map.put("Новопашин","Василий");
        map.put("Тузов","Олег");
        map.put("Кравченко","Костя");
        map.put("Сивец","Антон");
        map.put("Разин","Андрей");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
            removeItemFromMapByValue(map, String.valueOf(map.values()));


    }



    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());

        }


    }

    public static void main(String[] args) {
        for (Map.Entry<String, String> pair : createMap().entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " : " + value);
        }
        removeTheFirstNameDuplicates(createMap());
        for (Map.Entry<String, String> pair : createMap().entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " : " + value);
        }

    }
}
