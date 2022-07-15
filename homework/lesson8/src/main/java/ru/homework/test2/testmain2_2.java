package ru.homework.test2;

public class testmain2_2 {
    public static void main(String[] args) {

        Cat cat = new Cat(); // Создаем обьект типа Кот
        Robot robot = new Robot(); // Создаем обьект типа Робот
        People people = new People(); // Создаем обьект типа Человек
        Road road = new Road(); // Создаем обьект типа Беговая дорожка
        Wall wall = new Wall(); // Создаем обьект типа Стена


        Runnable[] members = new Runnable[3]; // Создаем массив с Участниками
        members[0] = cat; // Иницализируем обьекты по индексам
        members[1] = robot; // Иницализируем обьекты по индексам
        members[2] = people; // Иницализируем обьекты по индексам

        Barrier[] barriers = new Barrier[2]; // Создаем массив с Препятствиями
        barriers[0] = road; // Иницализируем обьекты по индексам
        barriers[1] = wall; // Иницализируем обьекты по индексам


        // Перебираем массивы
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j] == road){  // Указываем условия
                    road.runBarrier(150);
                } else {
                    wall.jumpBarrier(2);
                }
                System.out.println(barriers[j]); // Проверка для себя(все ли участники прошли по всем препятствиям)
            }
            System.out.println(members[i]); // Проверка для себя(все ли участники прошли по всем препятствиям)
        }
    }
}
