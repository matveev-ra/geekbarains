package ru.homework.lesson8;

public class Wall implements Barrier {
    private int jumpheight;

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getHeight() {
        return jumpheight;
    }

    public Wall (int jumpheight) {
        this.jumpheight = jumpheight;
    }

    public void getJumping(int jumpheight) {
        System.out.printf("Стена: %s м ", jumpheight);
    }
}