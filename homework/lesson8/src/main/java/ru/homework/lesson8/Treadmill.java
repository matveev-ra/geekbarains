package ru.homework.lesson8;

//Класс беговая дорожка
public class Treadmill implements Barrier {
    private int rundistance;

    @Override
    public int getLength() {
        return rundistance;
    }
    @Override
    public int getHeight() {
        return 0;
    }

    public Treadmill(int rundistance) {
        this.rundistance = rundistance;
    }

    public void goRuning (int rundistance) {

      System.out.println("Беговая дорожка: %s м" + rundistance);
    }

}
