package ru.homework.test;

public class Wall implements Obstacle {
    private String name;
    private double height = 0;

    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }


}