package me.rostkov.lab.task.chapter_4.unit_5;

public class StrictlyName {
    private String name;
    private String surname;
    private String patronymic;

    public StrictlyName(String name, String patronymic, String surname) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public StrictlyName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public StrictlyName(String name) {
        this.name = name;
    }

    /**
     * Генерирует отчество для данного имени.
     * Используются правила русской именной системы.
     *
     * @return отчество
     */
    public static String toPatronymic(String name) {
        String patronymic = "";

        patronymic = name + "ович";

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

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

}
