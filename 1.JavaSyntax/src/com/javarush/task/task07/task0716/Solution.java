package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       // BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("жопа"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
    /*1. Программа не должна считывать данные с клавиатуры.
2. Метод fix должен удалять из списка строк все слова, содержащие букву «р». Исключение: слова содержащие и букву «р» и букву «л» - их нужно оставить.
3. Метод fix должен удваивать слова, содержащие букву «л» (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву «л» и букву «р» - их не нужно удваивать.
4. Метод fix не должен ничего делать со словами, содержащими и букву «л» и букву «р».
5. Метод fix не должен ничего делать со словами, которые не содержат ни букву «л», ни букву «р».*/

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int j = 0; j < list.size(); j++) {
        for (int i = 0; i < list.size();) {

            if (list.get(i).contains("р") && (!list.get(i).contains("л"))) list.remove(i);

            else i++;}
             if (list.get(j).contains("л") && (!list.get(j).contains("р"))) {
               list.add(list.get(j));}


        }
    /*    for (int i = 0; i < list.size();) {
            if (list.get(i).contains("л") && (!list.get(i).contains("р"))) {
              list.add(list.get(i));}
            else i++;
        }*/

        return list;
    }
}