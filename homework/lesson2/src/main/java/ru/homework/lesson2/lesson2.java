package ru.homework.lesson2;

import java.util.Arrays;

public class lesson2 {

    public static void main (String[] args){
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        minMax();

    }
    //задача1
    public static void invertArray() {
        int[] numbArr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < numbArr.length; i++) {
            //numbArr[i] = numbArr[i] == 0 ? 1 : 0;//короткая запись условия
            if ( numbArr[i] == 0 ) {
                numbArr[i] = 1;
            } else  {
                numbArr[i] = 0;
            }
            //System.out.print(numbArr[i]);
        }
        System.out.println(Arrays.toString(numbArr));
    }
    //задача2
    public static void fillArray() {
        int[] numbArr = new int[8];
        for (int i = 0; i < numbArr.length; i++) {
            numbArr[i] = i*3;
        }
        System.out.println(Arrays.toString(numbArr));
    }
    //задача3
    public static void changeArray() {
        int[] numbArr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < numbArr.length; i++) {
            if ( numbArr[i] < 6 ) {
                numbArr[i] = numbArr[i]*2;
            }
        }
        System.out.println(Arrays.toString(numbArr));
    }
    //задача4
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];

        for (int x = 0; x < 4; x++){
            for(int y = 0; y < 4; y++){
                if ( x == y){
                    arr[x][y] = 1;
                }
                arr[x][arr.length - x - 1] = 1;
                System.out.printf("%d ", arr[x][y]);

            }
            System.out.println();
        }
    }

    public static void minMax() {
        int [] mass5 = { 4, 5, 2, -7, -120, 456, 3000};
        int minN = 0; //для определения индекса минимального значения
        int min = mass5[minN];
        int maxN = 0; //для определения индекса максимального значения
        int max = mass5[maxN];
        for (int i = 0 ; i < mass5.length; i++) {
            if (mass5[i] < min) {
                min = mass5[i];
                minN = i;
            }
            if (mass5[i] > max) {
                max = mass5[i];
                maxN = i;
            }
        }
        //Вывожу именно индекс элемента, а непорядковый номер
        System.out.printf("Минимальный элемент имеет индекс [%d] и равен %d\n", minN, min);
        //Вывожу именно индекс элемента, а непорядковый номер
        System.out.printf("Максимальный элемент имеет индекс [%d] и равен %d\n", maxN, max);


    }

}
