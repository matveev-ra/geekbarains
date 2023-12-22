package ru.homework.teachingProject;

/**
 * Базовый интерфейс - Бегун
 */
public interface Runner {

    /**
     * Прыжок
     * @param height высота прыжка
     * @return результат прыжка (удалось перепрыгнуть препятствие или нет)
     */
    boolean jump(int height);

    /**
     * Бег
     * @param length дистанция
     * @return результат забега (удалось пробежать дистанцию или нет)
     */
    boolean run(int length);

    /**
     * Получить имя бегуна
     * @return Имя
     */
    String getName();

    /**
     * Получить максимальную дистанцию
     * @return
     */
    int getMaxRun();

    /**
     * Получить максимальную высоту прыжка
     * @return
     */
    int getMaxJump();
}