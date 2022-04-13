package ru.geekbrains.lesson7;

public class Sample01 {

    static String str5;

    public static void main(String[] args) {

        String str1 = "Hello, GeekBrains!";
        String str2 = new String();
        String str3 = new String(new char[] {'H', 'e', 'l', 'l', 'o'});
        String str4 = "Hello";

        System.out.println(str1);
        System.out.println("Длинна строки: " + str1.length());


        String str6 = "";

        if (str5 != null)
            System.out.println("Длинна строки: " + str5.length());



    }

}

class MyString{

    private char[] arr;

    MyString(){
        arr = new char[0];
    }

    MyString(char[] arr){
        this.arr = arr;
    }


}








