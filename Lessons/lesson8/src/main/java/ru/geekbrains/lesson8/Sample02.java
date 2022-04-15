package ru.geekbrains.lesson8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample02 {

    static Random random = new Random();

    static Employee generateEmploye(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int typeIndex = random.nextInt(2); // 0 - 1
        int salary = random.nextInt(501 - 200) + 200; // 200 - 500
        int salaryIndex = random.nextInt(61) + 100;

        switch (typeIndex){
            case 0:
                return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], salary);
            case 1:
                return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], salary*salaryIndex);
        }
        return null;
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmploye();
            System.out.println(employees[i]);
        }

        Arrays.sort(employees);
        //Arrays.sort(employees, new SalaryComparator());

        System.out.println("\n***\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }



}

class SalaryComparator implements Comparator<Employee>{

    // > 0 -> o1 > o2
    // == 0 -> o1 == o2
    // < 0 -> o1 < o2
    @Override
    public int compare(Employee o1, Employee o2) {
        /*
                return o1.calculateSalary() == o2.calculateSalary() ? 0 :
                (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
         */
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}

class Freelancer extends Employee{

    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return 21.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата: %.2f (руб.); Почасовая ставка: %.2f (руб.)",
                surname, name, calculateSalary(), salary);
    }
}

class Worker extends Employee{

    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, calculateSalary());
    }
}

abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surname;
    protected double salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();
    /*public double calculateSalary(){
        return salary;
    }*/

    @Override
    public int compareTo(Employee o) {
        return Double.compare( o.calculateSalary(), this.calculateSalary());
    }
}