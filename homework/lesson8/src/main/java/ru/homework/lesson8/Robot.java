package ru.homework.lesson8;

public class Robot implements Runnable {
    private String name;

    public Robot (String name) {
        this.name = name;
    }


    @Override
    public void run(int distance) {
        System.out.printf("Робот %s пробежал %d метров\n", name, distance);
    }

    @Override
    public void jump(int height) {
        System.out.printf("Робот %s прыгнул %d метров\n", name, height);
    }
}