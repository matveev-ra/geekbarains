package ru.homework.lesson1;

public class MainApp {
    public static void main (String[] args){
        //System.out.println("Hello World!");

        //задание 2
        byte byteVal = -100;
        short shortVal = 15400;
        int intVal = 100;
        long longVal = 24879564l;
        float floatVal = 12.23f;
        double doubleVal = 15.65;
        char charVal = '\u00A9';
        boolean booleanVal = true;
        //пример вывода
        System.out.println("byte = " + byteVal + "\n" + "short = " + shortVal + "\n" + "int = " +  intVal + "\n" + "long = " +  longVal + "\n" + "float = " + floatVal + "\n" + "double = " +  doubleVal + "\n" + "char = " +  charVal + "\n" + "boolean = " + booleanVal);

        //задание - 3
        System.out.println (sumNumbers (2.2f, 10.5f, 10f, 10.7f));

        //задание - 4
        System.out.println (number10to20 (10, 2));

        //задание - 5
        isPositiveOrNegative(30);

        //задание - 6
        System.out.println (isNegative(20));

        //задание - 7
        printText("Роман");

        //задание - 5
        year(2105);

    }

    // возвращаем результат вычеслений
    public static float sumNumbers (float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    //определение числа в диапозоне от 10 до 20
    public static boolean number10to20 (int numb1, int numb2) {
        int sum = numb1 + numb1;
        return (sum > 10 && sum < 20);
    }

    //отрицательное или положительное число
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицателоьное");
        }
    }

    //возвращаем true / false  если отрицательно или положительное число
    public static boolean isNegative(int x) {
        if(x >= 0) {
            return true;
        }
        return false;
    }

    //выводим текст
    public static void printText(String name) {
        System.out.println("Привет, " + name + "!"); // печатается результат работы метода
    }

    //проверка высосоксный или не высокосный год
    public static void year(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год высокосный");
        } else {
            System.out.println("год не высокосный");
        }
    }


}