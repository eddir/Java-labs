package me.rostkov.lab.task.chapter_1.unit_4;

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

    public String toString() {
        if (this.surname != null) {
            if (this.patronymic != null) {
                return this.name + " " + this.patronymic + " " + this.surname;
            }
            return this.name + " " + this.surname;
        }
        return this.name;
    }
}
