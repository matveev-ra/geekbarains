package ru.geekbrains.lesson7;

public class Sample04 {

    public static void main(String[] args) {

        // StringBuilder StringBuffer
        StringBuilder stringBuilder01 = new StringBuilder("За окном потоп, а я ем торт.");
        StringBuilder stringBuilder02 = new StringBuilder(1000);
        stringBuilder02.ensureCapacity(500);
        stringBuilder01.append(" Очень холодно!");
        System.out.println(stringBuilder01);

        StringBuilder stringBuilder03 = new StringBuilder("Hello GeekBrains");
        stringBuilder03.insert(5, ',');
        System.out.println(stringBuilder03);

        stringBuilder03.insert(17, '!');
        System.out.println(stringBuilder03);

        stringBuilder03.delete(0, 7);
        System.out.println(stringBuilder03);

        stringBuilder03.replace(0, 10, "Java");

        System.out.println(stringBuilder03);

        stringBuilder03.reverse();
        System.out.println(stringBuilder03);

    }

}
