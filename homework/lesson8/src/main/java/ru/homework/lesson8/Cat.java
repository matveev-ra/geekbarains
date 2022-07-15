package ru.homework.lesson8;

public class Cat implements Runnable {
    private String name;
    private String runlength;
    private String jumpheght;



    public Cat (String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        System.out.printf("Кот %s пробежал %d метров\n", name, distance);
    }

    @Override
    public void jump(int height) {
        System.out.printf("Кот %s прыгнул %d метров\n", name, height);
    }
}
