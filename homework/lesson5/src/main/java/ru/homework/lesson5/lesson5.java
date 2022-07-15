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

public class lesson5 {
    public static void main(String[] args) {

        //создание обектов на базе класса/шаблона/типа - Employee
        //и инициализация обектов путем передачи аргументов в костструктор
        //Employee employee0 = new Employee("Иванов Иван Иванович");
        //employee0.displayInfo();


        //создние обектов - типа сотрудник
        Employee employee1 = new Employee("Иванов Иван Иванович");
        Employee employee2 = new Employee("Петров Сергей Петрович","Бухгалетр>", "bh@mail.ru", "+7980 111-666-88", 500000, 48);
        Employee employee3 = new Employee("Жгунов Евгений Сергеевич", "Менеджер",  "mn@mail.ru", "+7980 111-666-88", 400000, 42);
        Employee employee4 = new Employee("Сидоров Дмитрий Олегович", "Бригадир",  "br@mail.ru", "+7980 111-666-88", 40000, 38);
        Employee employee5 = new Employee("Маргунов Юрий Алесандрович", "специалист", "sp@mail.ru", "+7980 111-666-88", 30000,35);

        // через масив выводим информацию о сотрудниках у кого возраст больше 40
        System.out.println("**** Сотрудники старше 40 лет ******");

        Employee[] emplArr = new Employee[5];
        emplArr[0] = employee1;
        emplArr[1] = employee2;
        emplArr[2] = employee3;
        emplArr[3] = employee4;
        emplArr[4] = employee5;
        for (Employee employee: emplArr ) {
            if (employee.getAge() > 40 ){
                employee.displayInfo();
            }

        }

    }
}
