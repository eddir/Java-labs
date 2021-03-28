package me.rostkov.lab.task.chapter_2.unit_6;

public class Album {

    private String name;
    private String author;

    public Album(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
