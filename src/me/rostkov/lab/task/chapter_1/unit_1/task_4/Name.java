package me.rostkov.lab.task.chapter_1.unit_1.task_4;

public class Name {

    private String name;
    private String surname;
    private String patronymic;

    public Name(String name, String patronymic, String surname) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Name(String name) {
        this.name = name;
    }

    /**
     * Генерирует отчество для данного имени.
     * Используются правила русской именной системы.
     * @return отчество
     */
    public static String toPatronymic(String name) {
        String patronymic = "";

        patronymic = name + "ович"; // TODO: найти готовую либу или изобрести велосипед

        return patronymic;
    }

    public String toString() {
        if (this.surname != null) {
            if (this.patronymic != null) {
                return this.name + " " + this.patronymic + " " + this.surname;
            }
            return this.name + " " + this.surname;
        }
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
