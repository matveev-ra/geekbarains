package ru.homework.lesson8;

public class lesson8 {
    public static void main(String[] args) {


        Runnable[] runners = {
                new Human("Иван"),
                new Cat("Барсик"),
                new Robot("Дройд")
        };

        Barrier[] barriers = {
                new Wall(2),
                new Treadmill(20)
        };


        for (int runner = 0; runner < runners.length; runner++) {
            Runnable member = runners[runner];



            for (int barrier = 0; barrier < barriers.length; barrier++) {
                Barrier jumper = barriers[barrier];


                //System.out.println();

//                Activity member = members[memberIndex];
//                Barrier barrier = barriers[barrierIndex];
//
//                Boolean isPassed = barrier.passTheTest(member);
//
//                if (isPassed) {
//                    System.out.println(member.getName() + " успешно  " + barrier.getName() + " test");
//                } else {
//                    System.out.println(member.getName() + " не успешно  " + barrier.getName() + " test");
//                    break;
//                }
            }
        }
    }
}

interface Runnable {
    void run(int distance);
    void jump(int height);
}

interface Barrier {
    int getLength();
    int getHeight();

}




