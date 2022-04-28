package ru.homework.lesson5;
/**
        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        2. Конструктор класса должен заполнять эти поля при создании объекта.
        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
        консоль.
        4. Создать массив из 5 сотрудников.
        Пример:
            Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
            persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
            30000, 30); // потом для каждой ячейки массива задаем объект
            persArray[1] = new Person(...);
            ...
            persArray[4] = new Person(...);
        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет
**/


public class Employee {

    // поля/переменные класса Employee
    private String fullName;
    private String status;
    private String email;
    private String phone;
    int payment;
    private int age;
    private int id;
    private static int counter;//static - глобальная переменная кторая живет на самом объекте класса Employee

    //через мктод get получаем доступ к полю Age
    public int getAge(){
        return age;
    }



    // Инициализатор
    // инициализирует все поля и присваевает данные по умолчанию,
    // кторые потом будет выводится в конструкторе по умолчанию
    {
        fullName = "Василий Пупкин Ивановоич";
        status = "сотрудник";
        email =  "default@mail.ru";
        phone = "+7 999 999 99 99";
        payment = 10000;
        age = 30000;
        id = ++counter;
    }

    //конструктор по умолчанию
    Employee() { }

    //перегрузка констструкторов
    Employee(String fullName) {
        this(fullName, "сотрудник");
    }
    Employee(String fullName, String status ) {
        this(fullName, status, "default@mail.ru");
    }
    Employee(String fullName, String status, String email ) {
        this(fullName, status, email, "+7 999 999 99 99");
    }
    Employee(String fullName, String status, String email, String phone) {
        this(fullName, status, email, phone, 10000);
    }
    Employee(String fullName, String status, String email, String phone, int payment ) {
        this(fullName, status, email, phone, payment, 30 );
    }
    Employee(String fullName, String status, String email, String phone, int payment, int age ) {
        this.fullName = fullName;
        this.status = status;
        this.email =  email;
        this.phone = phone;
        this.payment = payment;
        this.age = age;
    }
    //вывод в консоль информации класса/объекта
    public void displayInfo(){
        System.out.printf("ID: %d\nФИО: %s\nДолжность: %s\nEmail: %s;\nТелефон: %s\nЗарплата: %d\nВозраст: %d\n\n", id, fullName, status, email, phone, payment, age);
    }


}
