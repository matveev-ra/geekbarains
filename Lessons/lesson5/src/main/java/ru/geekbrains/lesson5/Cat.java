package ru.geekbrains.lesson5;

public class Cat {

    private String name;
    private int age;
    private String color;
    private int id;
    private static int counter;

    public static int getCounter(){
        return counter;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age <= 0){
            this.age = 1;
        }
        else {
            this.age = age;
        }
    }

    // Инициализатор
    {
        System.out.println("Initializer");
        name = "Кот";
        age = 1;
        color = "Черный";
        id = ++counter;
    }

    Cat(){

    }

    Cat(String name){
        //this.name = name;
        this(name, 1);
    }

    Cat(String name, int age){
        this(name, age, "Белый");
        //this.name = name;
        //this.age = age;
    }

    Cat(String name, int age, String color){
        System.out.println("Constructor");
        if (age <= 0){
            this.age = 1;
        }
        else {
            this.age = age;
        }

        this.name = name;

        this.color = color;
    }

    /*Cat(){

    }

    Cat(String name){

    }*/


    public void displayInfo(){
        System.out.printf("Id: %d\tName: %s\tAge: %d;\tColor: %s\n",id, name, age, color);
    }

    public void updateName(String newName){
        name = newName;
    }

}
