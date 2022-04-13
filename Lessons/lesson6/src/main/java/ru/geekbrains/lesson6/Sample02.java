package ru.geekbrains.lesson6;

public class Sample02 {

    public static void main(String[] args) {

        FatCat fatCat01 = new FatCat("Персик", 10);
        fatCat01.jump();
        System.out.println("Вес кота: " + fatCat01.getWeight());

        Dog dog01 = new Dog("Шарик", "Черный");
        dog01.voice();
        System.out.println("Цвет животного: " + dog01.getColor());

        AnimalV2 fatCat02 = new FatCat("Барсик", 10);
        fatCat02.voice();
        AnimalV2 dog02 = new Dog("Бублик", "Черный");
        dog02.voice();

        Object fatCat03 = new FatCat("Тиграша", 15);
        Object dog03 = new Dog("Бим", "Белый");

        System.out.println("\n***\n");

        doProcess(fatCat02);
        doProcess(dog02);
    }

    public static void doProcess(AnimalV2 animal){
        animal.voice();
        animal.jump();

        if (animal instanceof FatCat){
            System.out.println("Вес животного: " + ((FatCat)animal).getWeight());
        }


    }

}

class FatCat extends AnimalV2{

    private int weight;

    public FatCat(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает.");
    }


}

class Dog extends AnimalV2{

    private String color;

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("Собака лает.");
    }
}

abstract class AnimalV2{

    private String name;

    public AnimalV2(String name) {
        this.name = name;
    }

    /*public void voice(){
        System.out.println("Животное подало голос.");
    }*/

    public abstract void voice();

    public void jump(){
        System.out.println("Животное подпрыгнуло.");
    }

}