package ru.homework.lesson5;

public class Cat {
    String name;
    String color;
    int age;

    //конструктор класса Cat
    public Cat(String name, String color, int age) {
        // this - чтобы отличить аргумент от полей класса/объекта
        this.name = name;
        this.color = color;
        this.age = age;

    }
    public Cat(String name) {
        // this - чтобы отличить аргумент от полей класса/объекта
        this.name = name;

    }
}
