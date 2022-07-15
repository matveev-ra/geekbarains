package ru.homework.lesson8;

public class Human implements Runnable {

    private String name;

    public Human (String name) {
        this.name = name;
    }


    @Override
    public void run(int distance) {
        System.out.printf("Человек %s пробежал %d метров\n", name, distance);
    }

    @Override
    public void jump(int height) {
        System.out.printf("Человек %s прыгнул %d метров\n", name, height);
    }

}
