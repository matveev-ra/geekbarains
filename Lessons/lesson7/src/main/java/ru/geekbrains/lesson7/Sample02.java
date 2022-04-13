package ru.geekbrains.lesson7;

import java.util.Objects;

public class Sample02 {

    public static void main(String[] args) {

        String str1 = "Hello,";
        String str2 = "GeekBrains";

        String str3 = str1 + " " + str2;
        System.out.println(str3);

        int day = 9;

        String str4 = "Сегодня " + day + " апреля";
        System.out.println(str4);

        String str5 = "Сегодня " + (5 + 4) + " апреля";
        System.out.println(str5);

        Cat cat = new Cat("Персик");

        String str6 = "Мой кот: " + cat;
        System.out.println(str6);

        String str7 = "GeekBrains";
        String str8 = "GeekBrains";
        String str9 = new String("GeekBrains");

        Cat cat1 = new Cat("Персик");
        Cat cat2 = new Cat("Персик");

        // ==
        System.out.println(str7 == str9);

        System.out.println(str7.equals(str9));
        System.out.println(cat1.equals(cat2));



    }

}

class Cat{

    private String name;

    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Cat)){
            return false;
        }

        return name.equals(((Cat)o).name);

    }
}
