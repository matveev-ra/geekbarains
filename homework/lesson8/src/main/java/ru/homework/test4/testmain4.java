package ru.homework.test4;


public class testmain4 {
    public static void main(String[] args) {

        Actions[] actions = new Actions[3];
        actions[0] = new Human("Boris", 10, 2);
        actions[1] = new Robot("Robik", 5, 2);
        actions[2] = new Cat("Barsik", 6, 1);

        Barrier[] barriers = new Barrier[2];
        barriers[0] = new Road( 10);
        barriers[1] = new Wall(2);


        for (Actions action : actions) {
            boolean result = true;

            for (Barrier barrier : barriers) {

                result = barrier.moving(action);

                if (!result) {
                    break;
                }
                System.out.println("------");
            }

            if (result) {
                System.out.println("Прошел дистанцию!!");
                System.out.println("********");
            } else {
                System.out.println("Сошел с дистанции!!");
                System.out.println("********");
            }
        }
    }
}

interface Actions {
    void run();

    void jump();

    int getRunDistance();

    int getJumpHeight();
}

abstract class Barrier {
    protected abstract boolean moving(Actions actions);
}
