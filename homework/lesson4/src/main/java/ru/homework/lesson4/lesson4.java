package ru.homework.lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {

    static final char DOT_HUMAN = 'X'; // Фишка игрока - человек
    static final char DOT_AI = '0'; // Фишка игрока - компьютер
    static final char DOT_EMPTY = '■'; // Признак пустого поля

    static final Scanner scanner = new Scanner(System.in);
    static final Random random = new Random();

    static char[][] field; // Двумерный массив, хранит текущее состояние игрового поля
    static int fieldSizeX; // Размерность игрового поля
    static int fieldSizeY; // Размерность игрового поля

    // Инициализация игоровых клеток
    static void initialize(){
        // Установим размерность игрового поля
        fieldSizeX = 3;
        fieldSizeY = 3;

        // Инициализация массива, описывающего игровое поле
        field = new char[fieldSizeX][fieldSizeY];

        // Проинициализируем массив, описывающий игровое поле
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                field[x][y] = DOT_EMPTY;
            }
        }

    }

     //Отрисовка игрового поля
     static void printField(){
        //выводим символ в самом в углу
        System.out.print("●");

        // Шапка поля - выводим номера столбцов, чередуя между ними символ -
        // через цикл перебираем если четное то выводим символ если нет то выводим число +1
        for (int i = 0; i < fieldSizeX*2 + 1; i++) {
            // коротнкая запись - тернарная операция
            System.out.print((i % 2) == 0 ? "·" : i /2 + 1);

            /*  // длинная запись
             *   if (i % 2 == 0){
             *       System.out.print("-");
             *   }
             *   else {
             *       System.out.print((i / 2) + 1);
             *   }
             */

            /* // длинная запись 2
             *   String s;
             *   s = i % 2 == 0 ? "-" : String.format("%d", (i / 2) + 1);
             */
        }

        System.out.println();

        // отрисовка самого поля
        for (int x = 0; x < fieldSizeX; x++) {
            //распечатываем номера строк
            System.out.print(x + 1 + "|");
            for (int y = 0; y <  fieldSizeY; y++) {
                //распечатываем пустые клетки из масива
                System.out.print(field[x][y] + "|");
            }
            System.out.println();
        }

        // вывод нижней части поля
        for (int i = 0; i <= fieldSizeX*2 + 1; i++) {
            System.out.print("¯");
        }

        System.out.println();

    }

    //Обработка хода игрока
    static void humanTurn(){
        int x, y;
        do{
            System.out.println("Введите координаты хода X и Y (от 1 до 3) через пробел >>>");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[x][y] = DOT_HUMAN;
    }

    // Проверка, ячейка является пустой (DOT_EMPTY)
    static boolean isCellEmpty(int x, int y){
        return field[x][y] == DOT_EMPTY;
    }

    //Проверка корректности ввода (координаты хода не должны превышать размерность массива)
    static boolean isCellValid(int x, int y){
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    //Обработка хода игрока (компьютера)
    static void aiTurn(){
        /*for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                field[x][y] = DOT_HUMAN;
                if (checkWinV2(DOT_HUMAN)){
                    field[x][y] = DOT_AI;
                    return;
                }
            }
        }*/

        int x, y;
        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        }
        while (!isCellEmpty(x, y));

        field[x][y] = DOT_AI;
    }

    //Проверка на ничью (все поле заполнено фишками игроков)
    static boolean checkDraw(){
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                if (isCellEmpty(x, y))
                    return false;
            }
        }
        return true;
    }

    //Проверка победы
    static boolean checkWin(char c){
        // Проверка по трем горизонталям
        if(field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
        if(field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
        if(field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

        // Проверка по вертикалям
        if(field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
        if(field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
        if(field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

        // Проверка по диагоналям
        if(field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
        return field[0][2] == c && field[1][1] == c && field[2][0] == c;
    }



    //Метод проверки состояния игры
    static boolean gameChecks(char dot, String message){
        if (checkWin(dot)){
            System.out.println(message);
            return true;
        }
        if (checkDraw()){
            System.out.println("Ничья!");
            return true;
        }
        // Продолжим игру
        return false;
    }

    public static void main(String[] args) {
        do {
            initialize();
            printField();
            while (true) {
                humanTurn(); // Обработка хода человека
                printField();
                if (gameChecks(DOT_HUMAN, "Вы победили!")) {
                    break;
                }
                aiTurn();
                printField();
                if (gameChecks(DOT_AI, "Победил компьютер!")) {
                    break;
                }
            }
            System.out.print("Желаете сыграть еще раз? (Y - да)");
        } while (scanner.next().equalsIgnoreCase("Y"));

    }

}
