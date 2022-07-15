package ru.geekbrains.lesson6;

public class Sample01 {

    public static void main(String[] args) {

        Animal animal01 = new Animal("Четыре лапы и хвост");
        animal01.animalInfo();
        //animal01.jump();

        Cat cat = new Cat("Персик", "Рыжий");
        cat.animalInfo();
        cat.jump();

        Animal cat02 = new Cat("Барсик", "Серый");
        cat02.animalInfo();
        //cat02.jump();   ????????????????????


    }

}

class Cat extends Animal{

    private String color;

    public Cat(String name, String color){
        super(name);
        this.color = color;

    }

    @Override
    public void animalInfo() {
        //super.animalInfo();
        System.out.printf("Кот: %s; Цвет: %s\n", name, color);
    }



    public void jump() {
        System.out.println("Кот подпрыгнул.");
    }
}

class Animal{

    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Animal(){

    }

    public Animal(String name)
    {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    private void jump(){
        System.out.println("Животное подпрыгнуло.");
    }

}
