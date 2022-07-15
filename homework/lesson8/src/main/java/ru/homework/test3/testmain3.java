package ru.homework.test3;

public class testmain3 {
    public static void main(String[] args) {
        Test[] tests = {new Wall(), new Treadmill()};
        Actor[] actors = {new Man(), new Cat(), new Robot()};
        for (int actorIndex = 0; actorIndex < actors.length; actorIndex++) {
            for (int testIndex = 0; testIndex < tests.length; testIndex++) {
                Actor actor = actors[actorIndex];
                Test test = tests[testIndex];
                Boolean isPassed = test.passTheTest(actor);
                if (isPassed) {
                    System.out.println("The " + actor.getName() + " passed the " + test.getName() + " test");
                } else {
                    System.out.println("The " + actor.getName() + " failed the " + test.getName() + " test");
                    break;
                }
            }
        }
    }
}

interface Actor {
    String getName();

    int jump();

    int run();
}
 abstract class Test {
    abstract String getName();

    abstract int getHeight();

    abstract int getLength();

    Boolean passTheTest(Actor actor) {
        return actor.jump() >= this.getHeight() && actor.run() >= this.getLength();
    }
}
