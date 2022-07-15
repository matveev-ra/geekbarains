package ru.homework.test4;

public class Road extends Barrier {
    private int length;

    public Road(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Беговая дорожка  длина: " + length);
        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("пробежал успешно");
            return true;
        } else {
            System.out.println("пробежал не успешно");
            return false;
        }
    }
}
