package ru.homework.lesson7;

/**
 * 1. Расширить задачу про котов и тарелки с едой.
 *
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 * (например, в миске 10 еды, а кот пытается покушать 15-20).
 *
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
 * удалось покушать (хватило еды), сытость = true.
 *
 * 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
 * наполовину сыт (это сделано для упрощения логики программы).
 *
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
 * потом вывести информацию о сытости котов в консоль.
 *
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */


public class lesson7 {
    public static void main(String[] args) {
        //создаем масив котов
        Cat[] cats = {
                new Cat("Мурзик", 15),
                new Cat("Барсик", 10),
                new Cat("Пушок", 5),
                new Cat("Васька", 25),
                new Cat("Мур", 1)
        };

        //создаем обект - такрелка и ложим в тарелку 30 едениц еды
        Plate plate = new Plate(30);

        //перебираем массив и заствляем каждого кота поесть
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50); //добавляем корм
        plate.info();

    }
}
class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    //выводим информацию голоден или сыт
    public void info() {
        //String isHungry;
        //if (!hungry) {
        //    isHungry = "сыт";
        //} else {
        //    isHungry = "голоден";
        //}

        //кроткая запись условия что выше
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }

    public void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}

class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    //определяем хватает ли коту еды
    public boolean decreaseFood(int n) {
        int difference = food - n;
        if (difference < 0) {
            return false;
        }
        food -= n;
        return true;
    }

    //добавляем еду
    public void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("чашка: " + food);
    }
}


