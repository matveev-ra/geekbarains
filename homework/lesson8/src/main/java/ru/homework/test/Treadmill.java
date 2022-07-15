package ru.homework.test;

public class Treadmill implements Obstacle {
    private String name;
    private double length = 0;

    @Override
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public Treadmill(String name, double length) {
        this.name = name;
        this.length = length;
    }


}