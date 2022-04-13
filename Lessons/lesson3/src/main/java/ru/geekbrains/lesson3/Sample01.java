package ru.geekbrains.lesson3;

import java.util.Scanner;

public class Sample01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты: ");
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        System.out.printf("Кординаты: x= %d ; y= %d\n", X, Y);

        scanner.nextLine();

        System.out.println("Введите строку, пустая допускается:");
        String str01 = scanner.nextLine();
        System.out.printf("Вы ввели строку \"%s\"", str01);

        System.out.println("Введите слово:");

        String str02 = scanner.next();
        System.out.printf("Вы ввели слово: \"%s\"", str02);

        scanner.nextLine();

        System.out.println("Введите строку, пустая допускается:");
        String str03 = scanner.nextLine();
        System.out.printf("Вы ввели строку \"%s\"", str03);




    }

}
