package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Sample01 {


    static final char DOT_HUMAN = 'X'; // Фишка игрока - человек
    static final char DOT_AI = '0'; // Фишка игрока - компьютер
    static final char DOT_EMPTY = '•'; // Признак пустого поля
    static final int WIN_COUNT = 3; // Выигрышная комбинация

    static final Scanner scanner = new Scanner(System.in);
    static final Random random = new Random();

    static char[][] field; // Двумерный массив, хранит текущее состояние игрового поля
    static int fieldSizeX; // Размерность игрового поля
    static int fieldSizeY; // Размерность игрового поля



    /**
     * Инициализация объектов игры
     */
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

    /**
     * Отрисовка игрового поля
     */
    static void printField(){
        System.out.print("+");

        for (int i = 0; i < fieldSizeX*2 + 1; i++) {

            /*if (i % 2 == 0){
                System.out.print("-");
            }
            else {
                System.out.print((i / 2) + 1);
            }*/

            //String s;
            //s = i % 2 == 0 ? "-" : String.format("%d", (i / 2) + 1);
            System.out.print((i % 2) == 0 ? "-" : i /2 + 1);
        }


        System.out.println();
        for (int x = 0; x < fieldSizeX; x++) {
            System.out.print(x + 1 + "|");
            for (int y = 0; y <  fieldSizeY; y++) {
                System.out.print(field[x][y] + "|");
            }
            System.out.println();
        }


        for (int i = 0; i <= fieldSizeX*2 + 1; i++) {
            System.out.print("-");
        }

        System.out.println();
    }

    /**
     * Обработка хода игрока (человека)
     */
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

    /**
     * Обработка хода игрока (компьютера)
     * TODO: Сделать компьютер более умным
     */
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

    /**
     * Проверка, ячейка является пустой (DOT_EMPTY)
     * @param x координата хода
     * @param y координата хода
     * @return результат проверки
     */
    static boolean isCellEmpty(int x, int y){
        return field[x][y] == DOT_EMPTY;
    }

    /**
     * Проверка корректности ввода (координаты хода не должны превышать размерность массива)
     * @param x координата хода
     * @param y координата хода
     * @return результат проверки
     */
    static boolean isCellValid(int x, int y){
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    /**
     * Проверка на ничью (все поле заполнено фишками игроков)
     * @return
     */
    static boolean checkDraw(){
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                if (isCellEmpty(x, y))
                    return false;
            }
        }
        return true;
    }

    /**
     * Проверка победы
     * TODO: Переработать в ДЗ
     * @param c
     * @return
     */
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
        if(field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;

        return false;
    }

    static boolean checkWinV2(char c){
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                if (checkWinDot(c, x, y, WIN_COUNT))
                    return true;
            }
        }
        return false;
    }

    static boolean checkWinDot(char c, int x, int y, int winCount){
        //TODO: Совершаем 4 проверки
        return true;
    }

    /**
     * Метод проверки состояния игры
     * @param dot фишка игрока
     * @param message победный слоган
     *
     * true - завершение игры
     *
     * @return состояние игры
     */
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
        while (true){
            initialize();
            printField();
            while (true){
                humanTurn(); // Обработка хода человека
                printField();
                if (gameChecks(DOT_HUMAN, "Вы победили!")){
                    break;
                }
                aiTurn();
                printField();
                if (gameChecks(DOT_AI, "Победил компьютер!")){
                    break;
                }
            }
            System.out.print("Желаете сыграть еще раз? (Y - да)");
            if (!scanner.next().equalsIgnoreCase("Y"))
                break;
        }

    }

}
