package ru.homework.test4;

public class Wall extends Barrier {

    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Стена высота: " + heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("прыгнул успешно");

            return true;
        } else {
            System.out.println("прыгнул не успешно");

            return false;
        }
    }
}
