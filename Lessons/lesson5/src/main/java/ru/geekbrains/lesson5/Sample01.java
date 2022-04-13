package ru.geekbrains.lesson5;

public class Sample01 {

    public static void main(String[] args) {

        int counter = 0;
        Cat cat = new Cat("Персик");
        //cat.name = "Персик";
        //cat.age = 8;
        //cat.color = "Рыжий";
        cat.displayInfo();

        Cat cat2 = new Cat("Барсик", 8, "Серый");
        cat2.setAge(4);
        //cat2.name = "Барсик";
        //cat2.age = 3;
        //cat2.color = "Серый";
        //cat2.age = -5;
        cat2.displayInfo();

        Cat cat3 = new Cat();
        cat3.displayInfo();

        System.out.println("Счетчик: " + Cat.getCounter());

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = -5;
        arr[2] = 3;

        Cat[] catArr = new Cat[3];
        catArr[0] = cat;
        catArr[1] = cat2;
        catArr[2] = cat3;


    }

}
