package ru.geekbrains.lesson3;

import java.util.Scanner;

public class Sample02 {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Проверка, является ли число четным
     * @param n
     * @return
     */
    static boolean isEven(int n){

        //boolean f;
        //f = n % 2 == 0;
        //return f;

        return n % 2 == 0;
    }

    static void task1(){
        System.out.println("Подсчет суммы нечетных положительных чисел");
        System.out.println("===========================================");
        System.out.println("Вводите целые числа (0 - завершение ввода):");

        int sum = 0;
        int counter = 0;
        boolean isNumber = false;
        int number = 0;

        do {
            counter++; // counter = counter + 1;
            System.out.print("Введите число: ");
            isNumber = scanner.hasNextInt();

            if (isNumber){
                number = scanner.nextInt();
                scanner.nextLine();
                if (number > 0 && !isEven(number)){
                    sum += number; // sum = sum + number;
                }
            }
            else {
                System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите попытку ввода.");
                scanner.nextLine();
            }

        }
        while (!(isNumber && number == 0));

        System.out.printf("Сумма нечетных положительных чисел: %d;\nКол-во попыток ввода: %d\n", sum, counter);
        System.out.println("Завершение работы подпрограммы.");
    }

    static void task2(){
        System.out.println("Process task2 ...");
    }

    static void task3(){
        System.out.println("Process task3 ...");
    }

    public static void main(String[] args) {

        boolean f = true;

        while (f) {
            System.out.println("1 - Подсчет суммы чисел");
            System.out.println("2 - Task2");
            System.out.println("3 - Task3");
            System.out.print("Введите номер задачи (0 - выход из программы): ");

            if (scanner.hasNextInt()) {
                int no = scanner.nextInt();
                scanner.nextLine();
                switch (no) {

                    case 0:
                        System.out.println("Завершение работы программы.");
                        f = false;
                        break;
                    case 3:
                        task3();
                        break;

                    case 2:
                        task2();
                        break;

                    case 1:
                        task1();
                        break;

                    default:
                        System.out.println("Не удалось определить блок подпрограммы.\nПовторите попытку ввода.");
                }

            } else {
                System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите попытку ввода.");
                scanner.nextLine();
            }
        }

    }

}
