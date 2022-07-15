package ru.homework.test;

public class Human implements Overcomable {
    private String name;
    private double runLimit = 50;
    private double jumpLimit = 1;
    private boolean isTired = false;

    public Human(String name, double runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean overcomeObstacle(Obstacle obstacle) {
        if (isTired) {
            return false;
        }
        if (obstacle instanceof Treadmill) {
            System.out.println("Человек " + name + " препятствие - " + obstacle.getName() +
                    ". Его длина " + ((Treadmill) obstacle).getLength() + "м.");
            return run(((Treadmill) obstacle).getLength());

        } else if (obstacle instanceof Wall) {
            System.out.println("Человек " + name + " препятствие - " + obstacle.getName() +
                    ". Его высота " + ((Wall) obstacle).getHeight() + "м.");
            return jump(((Wall) obstacle).getHeight());
        }
        return false;
    }


    public boolean run(double length) {
        if (!isTired && length <= runLimit) {
            System.out.println("Человек " + name + " успешно пробежал " + length + "м.");
            return true;
        } else {
            System.out.println("Человек " + name + " не смог пробежать " + length + "м. Он выбывает из гонки.");
            isTired = true;
        }
        return false;
    }


    public boolean jump(double height) {
        if (!isTired && height <= jumpLimit) {
            System.out.println("Человек " + name + " успешно перепрыгнул " + height + "м.");
            return true;
        } else {
            System.out.println("Человек " + name + " не смог  перепрыгнуть. Он выбывает из гонки.");
            isTired = true;
        }
        return false;
    }




}
