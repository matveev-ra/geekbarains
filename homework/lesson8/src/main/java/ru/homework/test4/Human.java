package ru.homework.test4;

public class Human implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " пробежал " + runDistance);
    }

    @Override
    public void jump() {
        System.out.println("Человек " + name + " прыгнул " + jumpHeight);
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

}