package ru.homework.lesson5;

public class lesson5 {
    public static void main(String[] args) {

        //создание обектов на базе класса/шаблона/типа - Employee
        // и инициализация обекта путем передачи аргументов в костструктор

        Employee Employee0 = new Employee();
        Employee0.displayInfo();

        Employee Employee = new Employee("Иванов Иван Иванович");
        Employee.displayInfo();

        Employee Employee2 = new Employee("Петров Сергей Петрович","Руководитель");
        Employee2.displayInfo();

        Employee Employee3 = new Employee("Жгунов Евгений Сергеевич", "Менеджер", "mg@mail.ru");
        Employee3.displayInfo();

        Employee Employee4 = new Employee("Сидоров Дмитрий Олегович", "Бригадир", "br@mail.ru", "+7950 222-33-22");
        Employee4.displayInfo();

        Employee Employee5 = new Employee("Маргунов Юрий Алесандрович", "специалист", "sp@mail.ru", "+7980 111-666-88", 30000);
        Employee5.displayInfo();

        Employee Employee6 = new Employee("Жданов Валерий Русланович", "Специалист2", "sp2@mail.ru", "+7980 111-666-88", 30000, 48);
        Employee6.displayInfo();


    }
}
