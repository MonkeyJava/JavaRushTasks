package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> h = new ArrayList<>();
       h.add(new Human("ded1", true, 90)); //напишите тут ваш код
       h.add(new Human("ded2", true, 85));
        h.add(new Human("bab1", false, 88));
        h.add(new Human("bab2", false, 80));
        h.add(new Human("papa", true, 40));
        h.add(new Human("mama", false, 35));
        h.add(new Human("ch1", true, 10));
        h.add(new Human("ch2", false, 8));
        h.add(new Human("ch3", false, 5));
        for (int i = 0; i < 9; i++) {
            System.out.println(h.get(i).toString()); //напишите тут ваш код

        }


    }

    public static class Human {
        String name;
        boolean sex; //напишите тут ваш код
        int age;
        ArrayList<Human> children = new ArrayList<>();
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human ... children){
            this.name = name;
            this.sex = sex;
            this.age = age;

          //  this.children = children;
            for (Human c : children)this.children.add(c);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
