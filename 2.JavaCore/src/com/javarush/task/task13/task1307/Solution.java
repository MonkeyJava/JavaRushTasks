package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject<Object> implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {

            return null;//допишите здесь ваш код

        }
    }
}