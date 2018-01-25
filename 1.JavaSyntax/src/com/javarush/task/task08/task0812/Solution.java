package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        int count = 1;
        int max = 1;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            }
        for (int i = 0; i < list.size()-1; i++) {           // list.size() -1 для того чтобы далее можно было прибавить 1 для сравнения иначе ошибка
            if (list.get(i)==list.get(i+1)) count++; // сравниваем последовательность и считаем кол-во
            else count = 1; // если закончилась последовательность сбрасываем счетчик
            if (count > max) max = count; // Определяем мах последовательность
        }
        System.out.println(max);
    }
}