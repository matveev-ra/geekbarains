package ru.geekbrains.sample2;

import ru.geekbrains.sample1.Employee;
import ru.geekbrains.sample1.Person;

public class FactoryV2 {
    void doWork(){
        Person person = new Person();
        //person.name = "Станислав";
        Employee employee = new Employee();
        //employee.name = "...";
    }
}
