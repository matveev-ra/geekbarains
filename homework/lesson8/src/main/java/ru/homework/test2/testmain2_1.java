package ru.homework.test2;

public class testmain2_1 {
    public static void main(String[] args) {

        Cat cat = new Cat(); // Создаем обьект типа Кот
        Robot robot = new Robot(); // Создаем обьект типа Робот
        People people = new People(); // Создаем обьект типа Человек
        Road road = new Road(); // Создаем обьект типа Беговая дорожка
        Wall wall = new Wall(); // Создаем обьект типа Стена

        Barrier[] members = new Barrier[3]; // Создаем массив обьектов типа Препятствия (Участники)
        members[0] = cat; // Инииализируем обекты по индексам
        members[1] = robot; // Инииализируем обекты по индексам
        members[2] = people; // Инииализируем обекты по индексам


        for (int i = 0; i < members.length; i++) { // С помощью цикла проходим по всей длинне массива участников
            road.runBarrier(150); // Просим Участника дистанции выполнить действие
            wall.jumpBarrier(2); // Просим Участника препятствия выполнить действие
            System.out.println(members[i]); // Вывод в консоль для проверки самого себя,
            // что все участники произвели запрошенное действие
        }

        System.out.println();
        // Если необходимо по отдельности запросить участников пройти дистанцию,выполняем такую команду
        cat.runBarrier(150); // на обьекте вызываем необходимый метод
        cat.jumpBarrier(2); // на обьекте вызываем необходимый метод

        people.runBarrier(150); // на обьекте вызываем необходимый метод
        people.jumpBarrier(2); // на обьекте вызываем необходимый метод

        robot.runBarrier(150); // на обьекте вызываем необходимый метод
        robot.jumpBarrier(2); // на обьекте вызываем необходимый метод
    }
}
class Road implements Barrier{ // Создаем класс Беговая дорожка и имплементируем в нем интерфейс Препятсвия


    @Override
    public void jumpBarrier(int height) {

    }

    // Описываем метод из интерфейса Barrier
    @Override
    public void runBarrier(int distance) {
        if (distance <= 150){
            System.out.println("Участник успешно пробежал дистанцию " + distance + " м");
        } else {
            System.out.println("Участник не смог преодолеть дистанцию " + distance + " м");
        }
    }
}


class Wall implements Barrier{ // Создаем класс Стена и имплементируем в нем интерфейс Препятсвия

    // Описываем метод из интерфейса Barrier
    @Override
    public void jumpBarrier(int height) {
        if (height <= 2){
            System.out.println("Участник успешно преодолел препятствие " + height + " м");
        } else {
            System.out.println("Участник не смог преодолеть препятствие " + height + " м");
        }
    }

    @Override
    public void runBarrier(int distance) {

    }
}
