package ru.homework.lesson3;
/**
 * (1)
 * Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
 * попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
 * указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
 * выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 *
 * (2)
 * Создать массив из слов
 * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
 * "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
 * "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
 * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
 * сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если
 * слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
 * apple – загаданное
 * apricot - ответ игрока
 * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
 * Для сравнения двух слов посимвольно можно пользоваться:
 * String str = "apple";
 * char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
 * Играем до тех пор, пока игрок не отгадает слово.
 * Используем только маленькие буквы.
 */

import java.util.Random;
import java.util.Scanner;


public class lesson3 {

    static Scanner scanner = new Scanner(System.in);


    //задание - 1
    static void gameOne() {
        System.out.println("================================= ");
        System.out.println("Вам нужно угадать число от 0 до 9.");
        System.out.println("Угадайте число в три попытки ");


        Random numbers  = new Random();
        int random = numbers.nextInt(9);
        int userInput;
        int counter = 0;

        do {
            System.out.print("введи число: ");
            if(scanner.hasNextInt()) {
                userInput = scanner.nextInt();

                if (userInput < 0 || userInput > 9) {
                    counter--;
                } else if (userInput > random) {
                    System.out.println("надо меньше!");

                } else if (userInput < random) {
                    System.out.println("Надо больше!");

                } else {
                    System.out.println("Угадал! это число: " + random);
                    break;
                }
                counter ++;

                if(counter == 3) {
                    System.out.println("Проиграл! Ваши поппытки закончились");
                }

            } else {
                System.out.println("Попробуй еще раз");
                scanner.nextLine();
            }

        } while (counter < 3);

        System.out.println("Завершение работы подпрограммы.");
        scanner.nextLine();
        System.out.println("================================= ");
    }


    static void task2(){
        // Объявляем массив из слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        // Объявляем вспомогательный класс Random (для генерации случайного числа, сопоставление случайного числа индексу элементов массива слов)
        Random random = new Random();
        // Получаем случайное число
        int num = random.ints(0, 25).findFirst().getAsInt();
        // Выводим подсказку (загаданное слово на экран)
        System.out.format("Компьютер загадал слово, попробуйте его угадать (подсказка: \"%s\").\n", words[num]);

        // Создаем вечный цикл
        while(true) {
            String word; // Переменная будет хранить слово, которое вводит пользователь
            int counter = 0; // Счетчик, который будет хранить кол-во совпавших символов слов
            System.out.print("Введите слово: ");
            word = scanner.next();
            System.out.println();

            // Проходим по массиву из 15 индексов (как от нас требует задание, что бы составить маску из 15 знаков #)
            for (int i = 0; i < 15; i++){
                // Если текущий индекс "i" попадает в размерность длинны искомого слова и слова, которое мы ввели с консоли,
                // сравним символы двух слов по индексу "i"
                if (word.length() - 1 >= i && words[num].length() - 1 >= i && word.charAt(i) == words[num].charAt(i)){
                    // Символы слов равны, печатаем символ
                    System.out.print(word.charAt(i));
                    // Увеличиваем счетчик совпавших символов слов
                    counter++;
                    // Если все символы искомого слова и введенного совпали, мы, фактически, угадали слово, выходим из цикла
                    if (counter == words[num].length())
                        break;
                }
                else{
                    // Если символы слов не совпали, печатаем символ #
                    System.out.print("#");
                }
            }

            // Выводим результат сравнения двух слов:

            // Еще раз проверим, если все символы искомого слова и введенного совпали, мы, фактически, угадали слово.
            // Печатаем соответствующее сообщение и выходим из вечного цикла (завершаем работу метода)
            if (counter == words[num].length()){
                System.out.println("\n\nВы успешно угадали слово.");
                System.out.println("Завершение работы подпрограммы.");
                return;
            }
            else{
                // Если мы не угадали слово, предложим пользователю сыграть еще раз.
                System.out.format("\n\nВы не угадали слово.\n");
                while(true) {
                    System.out.print("Повторить игру еще раз? (1 – да / 0 – нет): ");
                    if (scanner.hasNextInt()) {
                        counter = scanner.nextInt();
                        if (counter == 0){
                            System.out.println("Завершение работы подпрограммы.");
                            return;
                        }
                        else if (counter == 1){
                            break;
                        }
                        else{
                            System.out.println("Номер пункта меню не найден. Пожалуйста, повторите попытку ввода.");
                            scanner.next();
                        }
                    } else {
                        System.out.println("Вы ввели некорректное число. Пожалуйста, повторите попытку ввода.");
                        scanner.next();
                    }
                }
            }
        }
    }
    static void task3() {
        System.out.println("Process task3 ...");
    }

    public static void main(String[] args) {
        boolean f = true;

        while (f) {
            System.out.println("1 - Игра - 'Угадай число'");
            System.out.println("2 - Task2");
            System.out.println("3 - Task3");
            System.out.print("Введите номер задачи (0 - выход из программы): ");

            if (scanner.hasNextInt()) {
                int  no = scanner.nextInt();
                scanner.nextLine();
                switch (no){
                    case 0:
                        System.out.println("Завершение работы программы.");
                        f = false;
                        break;
                    case  3:
                        task3();
                        break;
                    case  2:
                        task2();
                        break;
                    case  1:
                        gameOne();
                        break;

                    default:
                        System.out.println("Не удалось определить номер задачи\nПовторите попытку ввода.");
                }

            } else {
                System.out.println("Вы ввели некорректное число.\nПожалуйста, повторите попытку ввода. ");
                scanner.nextLine();
            }

        }
    }
}
