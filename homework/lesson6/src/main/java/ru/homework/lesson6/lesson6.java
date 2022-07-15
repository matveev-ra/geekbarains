package ru.homework.lesson6;

/**
 * ЗАДАЧИ
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
 * препятствия. Результатом выполнения действия будет печать в консоль.
 * (Например, * dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
 * кот не умеет плавать, собака 10 м.).
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */

public class lesson6 {
    public static void main(String[] args) {

        Dog dog01 = new Dog("Бобик");
        dog01.run(505);
        dog01.swim(9);
        System.out.println("********************");

        Dog dog02 = new Dog("Тузик");
        dog02.run(150);
        dog02.swim(9);
        System.out.println("********************");

        Cat cat01 = new Cat("Мурзик");
        cat01.run(300);
        cat01.swim(110);
        System.out.println("********************");

        Cat cat02 = new Cat("Барсик");
        cat02.run(190);
        cat02.swim(110);
        System.out.println("********************");

        System.out.println("Всего животных: " + Animal.getCounter());
        System.out.println("Собак: " + Dog.getDogcounter());
        System.out.println("Котов: " + Cat.getCatcounter());

    }
}

class Cat extends Animal{
    static int catcounter = 0;

    public static int getCatcounter() {
        return catcounter;
    }

    public Cat(String name) {
        super(name);
        ++catcounter;
    }

    @Override
    public void run(int distance) {
        int startdistance = 200;
        System.out.println("дистанция " + startdistance);
        if (distance >= startdistance){
            System.out.println(name + " не может пробежать эту дистанцию");
        }else {
            super.run(distance);
        }

    }

    @Override
    public void swim(int distance) {
            System.out.println(name + " не умеет плавать");
    }
}

class Dog extends Animal{
    static int dogcounter = 0;

    public static int getDogcounter() {
        return dogcounter;
    }

    public Dog(String name) {
        super(name);
        ++dogcounter;
    }

    @Override
    public void run(int distance) {
        int startdistance = 500;
        System.out.println("дистанция " + startdistance);
        if (distance >= startdistance){
            System.out.println(name + " не может пробежать такую дистанцию");
        }else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance >= 10){
            System.out.println(name + " не может проплыть такую дистанцию");
        }else {
            super.swim(distance);
        }
    }
}


class Animal {
    protected String name;
    //protected int distance;
    static int counter = 0;



    public static int getCounter() {
        return counter;
    }


    public Animal (String name){
        this.name = name;
        ++counter;
    }


    public void run(int distance){
        System.out.printf("%s пробежал %dм\n", name, distance);
    }

    public void swim(int distance){
        System.out.printf("%s проплыл %dм\n", name, distance);
    }

}
