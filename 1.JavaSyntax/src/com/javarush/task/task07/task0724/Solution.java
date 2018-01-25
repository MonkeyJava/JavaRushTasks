package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human Grandad1 = new Human("Vladimir", true, 67);
        System.out.println(Grandad1.toString());
        Human Grandma1 = new Human("Frosya", false, 65);
        System.out.println(Grandma1.toString());
        Human Grandad2 = new Human("Sviatoslav", true, 63);
        System.out.println(Grandad2.toString());
        Human Grandma2 = new Human("Katerine", false, 60);
        System.out.println(Grandma2.toString());
        Human Father = new Human("Vsevolod",true, 41, Grandad1, Grandma1);
        System.out.println(Father.toString());
        Human Mother = new Human("Nadeshda", false, 40, Grandad2, Grandma2);
        System.out.println(Mother.toString());
        Human Child1 = new Human("Antony", true, 18, Father, Mother);
        System.out.println(Child1.toString());
        Human Child2 = new Human("Philip", true, 13, Father, Mother);
        System.out.println(Child2.toString());
        Human Child3 = new Human("Karolina", false, 9, Father, Mother);
        System.out.println(Child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















