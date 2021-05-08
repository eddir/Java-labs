package me.rostkov.lab.task.chapter_1.unit_3.task_4;

import me.rostkov.lab.task.chapter_1.unit_2.task_6.Track;

import java.util.ArrayList;

public class LinkedTrack extends Track {

    protected LinkedAlbum album; // TODO: подходящая реализация паттерном декоратор?

    public LinkedTrack(String name, ArrayList<String> authors, LinkedAlbum album) {
        super(name, authors, album);
    }

    public LinkedTrack(String name, LinkedAlbum album, String author) {
        super(name, album, author);
    }

    public LinkedTrack(String name, String author) {
        super(name, author);
    }

    public LinkedTrack(String name) {
        super(name);
    }

    @Override
    public String toString() {
        // TODO: как это реализовать без повторяющихся строк?
        if (this.album != null && !this.authors.contains(this.album.getAuthor())) {
            this.authors.add(this.album.getAuthor());
        }
        if (this.authors.size() > 1) {
            return this.name + ", авторы: " + String.join(", ", this.authors);
        }
        return this.name + ", автор: " + this.authors.get(0);
    }

    public LinkedAlbum getAlbum() {
        return album;
    }

    public void setAlbum(LinkedAlbum linkedAlbum) {
        this.album = linkedAlbum;
        linkedAlbum.addTrack(this);
    }
}
