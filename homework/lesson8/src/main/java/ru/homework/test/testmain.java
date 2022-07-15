package ru.homework.test;

public class testmain {
    public static void main(String[] args) {

        //массив бегунов
        Overcomable[] runners = new Overcomable[3];
        runners[0] = new Cat("Барсик", 100, 1);
        runners[1] = new Human("Иван", 10000, 1.5);
        runners[2] = new Robot("Дройд", 999999, 10);

        //массив препятствий
        Obstacle[] obstacles = new Obstacle[5];
        obstacles[0] = new Wall("Стена", 1.2);
        obstacles[1] = new Treadmill("Беговая дорожка", 10);

        for (Obstacle obstacle : obstacles) {
            for (Overcomable runner : runners) {
                if (((Overcomable) runner).overcomeObstacle(obstacle) == false);
            }
            System.out.println();
        }
    }
}

interface Overcomable  {
    boolean overcomeObstacle(Obstacle obstacle);
    boolean run(double length);
    boolean jump(double height);
}

interface Obstacle {
    String getName();
}


