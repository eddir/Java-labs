package me.rostkov.lab.task;

public abstract class BaseTask implements Task {

    /**
     * Индентификатор задачи в списке в шестнадцатеричном формате
     */
    protected String id;

    /**
     * Краткое наименование задачи
     */
    protected String title;

    /**
     * Описание задачи
     */
    protected String description;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
