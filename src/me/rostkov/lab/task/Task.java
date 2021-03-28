package me.rostkov.lab.task;

public interface Task {

    /**
     * Возвращает идентификатор задачи
     * @return
     */
    public String getId();

    /**
     * Возвращает намиенование задачи
     * @return
     */
    public String getTitle();

    /**
     * Возвращает описание задачи
     * @return
     */
    public String getDescription();

    /**
     * запуск задачи по основному сценарию
     */
    public void start();

}
