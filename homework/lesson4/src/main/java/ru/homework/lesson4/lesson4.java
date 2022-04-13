package ru.homework.lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {


    static final char DOT_HUMAN = 'X'; // Фишка игрока - человек
    static final char DOT_AI = '0'; // Фишка игрока - компьютер
    static final char DOT_EMPTY = '•'; // Признак пустого поля
    static final int WIN_COUNT = 3; // Выигрышная комбинация

    static final Scanner scanner = new Scanner(System.in);
    static final Random random = new Random();

    static char[][] field; // Двумерный массив, хранит текущее состояние игрового поля
    static int fieldSizeX; // Размерность игрового поля
    static int fieldSizeY; // Размерность игрового поля


    public static void main(String[] args) {

    }

}
