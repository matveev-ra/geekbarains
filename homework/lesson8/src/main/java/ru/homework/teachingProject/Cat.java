package ru.homework.teachingProject;

/**
 * Кот
 */
public class Cat implements Runner {

    private final String name;
    private final int maxRun;
    private final int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s перепрыгнул через стену %d см\n", getName(), height);
            return true;
        } else {
            System.out.printf("%s не смог перепрыгнуть через стену %d см, остался на месте\n", getName(), height);
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length <= getMaxRun()) {
            System.out.printf("%s пробежал по беговой дорожке %d метров\n", getName(), length);
            return true;
        } else {
            System.out.printf("%s не смог пробежать по беговой дорожке %d метров, он смог пробежать только %d метров\n", getName(), length, getMaxRun());
            return false;
        }
    }
}
