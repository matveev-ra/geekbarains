package ru.geekbrains.lesson8;

public class Sample01 {

    public static void main(String[] args) {

        Dog dog01 = new Dog("Шарик");
        Cat cat01 = new Cat("Персик");
        Duck duck01 = new Duck("Дональд");
        Cat cat02 = new Cat("Барсик");

        Runnable cat03 = new Cat("Тиграша");

        Runnable[] animals = new Runnable[5];
        animals[0] = dog01;
        animals[1] = cat01;
        animals[2] = duck01;
        animals[3] = cat02;
        animals[4] = cat03;

        for (Runnable animal : animals) {
            animal.run(100);
            animal.swim(150);
            if (animal instanceof Flying){
                ((Flying)animal).fly(50);
            }
        }

    }

}

interface Runnable{

    void swim(int distance);
    void run(int distance);

}

interface Flying {
    void fly(int distance);
}

class Cat implements Runnable{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s пробежало %d метров\n", name, distance);
    }
}

class Duck implements Runnable, Flying{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s проплыла %d метров\n", name, distance);
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s пробежала %d метров\n", name, distance);
    }

    @Override
    public void fly(int distance) {
        System.out.printf("%s пролетела %d метров\n", name, distance);
    }
}

class Dog implements Runnable{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s проплыло %d метров\n", name, distance);
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s пробежало %d метров\n", name, distance);
    }
}
