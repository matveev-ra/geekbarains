package ru.homework.test2;

public class testmain2 {
    public static void main(String[] args) {

        People people = new People(); // Создаем обьект типа Человек
        Cat cat = new Cat(); // Создаем обьект типа Кот
        Robot robot = new Robot(); // Создаем обьект типа Робот

        people.run(); // Просим Человека пробежать
        people.jump(); // Просим Человека подпрыгнуть

        cat.run(); // Просим Кота пробежать
        cat.jump(); // Просим Кота подпрыгнуть

        robot.run(); // Просим Робота пробежать
        robot.jump(); // Просим Робота подпрыгнуть
        robot.jumpBarrier(10);
    }
}



interface Runnable{ //Создаем интерфейс

    void run (); // Определяем методы, которые нужно реализовать
    void jump (); // Определяем методы, которые нужно реализовать
}

interface Barrier{ // Создаем интерфейс Препятсвия

    void jumpBarrier(int height); // Создаем методы
    void runBarrier(int distance); // Создаем методы
}


class People implements Runnable,Barrier{ // Создаем класс Человек и имплементируем в нем интерфейс Runnable и Barrier

    @Override // Имплементируем метод из интерфейса Runnable
    public void run() {
        System.out.println("Человек пробежался"); // Описываем реализацию метода
    }

    @Override // Имплементируем метод из интерфейса Runnable
    public void jump() {
        System.out.println("Человек подпрыгнул"); // Описываем реализацию метода
    }

    @Override
    public void jumpBarrier(int height) { // Имплементированный метод из интерфейса Barrier
        if (height <= 1){
            System.out.println("Человек успешно перепрыгнул препятсвие " + height + " м");
        } else {
            System.out.println("Человек не смог перепрыгнуть препятсвие " + height + " м");
        }
    }

    @Override
    public void runBarrier(int distance) { // Имплементированный метод из интерфейса Barrier
        if (distance <= 500){
            System.out.println("Человек успешно пробежал дистанцию " + distance + " м");
        } else {
            System.out.println("Человек не смог преодолеть дистанцию " + distance + " м");
        }
    }
}


class Cat implements Runnable,Barrier { // Создаем класс Кот и имплементируем в нем интерфейс Runnable и Barrier


    @Override // Имплементируем метод из интерфейса Runnable
    public void run() {
        System.out.println("Кот пробежался"); // Описываем реализацию метода
    }

    @Override // Имплементируем метод из интерфейса Runnable
    public void jump() {
        System.out.println("Кот подпрыгнул"); // Описываем реализацию метода
    }


    @Override
    public void jumpBarrier(int height) { // Имплементированный метод из интерфейса Barrier
        if (height <= 2){
            System.out.println("Кот успешно перепрыгнул препятсвие " + height + " м");
        } else {
            System.out.println("Кот не смог перепрыгнуть препятсвие " + height + " м");
        }
    }

    @Override
    public void runBarrier(int distance) { // Имплементированный метод из интерфейса Barrier
        if (distance <= 200){
            System.out.println("Кот успешно пробежал дистанцию " + distance + " м");
        } else {
            System.out.println("Кот не смог преодолеть дистанцию " + distance + " м");
        }
    }
}


class Robot implements Runnable,Barrier{ // Создаем класс Робот и имплементируем в нем интерфейс Runnable и Barrier

    @Override // Имплементируем метод из интерфейса Runnable
    public void run() {
        System.out.println("Робот пробежался"); // Описываем реализацию метода
    }

    @Override // Имплементируем метод из интерфейса Runnable
    public void jump() {
        System.out.println("Робот подпрыгнул"); // Описываем реализацию метода
    }

    @Override
    public void jumpBarrier(int height) { // Имплементированный метод из интерфейса Barrier
        if (height <= 1){
            System.out.println("Робот успешно перепрыгнул препятсвие " + height + " м");
        } else {
            System.out.println("Робот не смог перепрыгнуть препятсвие " + height + " м");
        }
    }

    @Override
    public void runBarrier(int distance) { // Имплементированный метод из интерфейса Barrier
        if (distance <= 100){
            System.out.println("Робот успешно пробежал дистанцию " + distance + " м");
        } else {
            System.out.println("Робот не смог преодолеть дистанцию " + distance + " м");
        }
    }
}
