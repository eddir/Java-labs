package me.rostkov.lab.task.chapter_2.unit_6;

import java.util.ArrayList;

public class Track {
    private String name;
    private ArrayList<String> authors;
    private Album album;

    public Track(String name, ArrayList<String> authors, Album album) {
        this.name = name;
        this.authors = authors;
        this.album = album;
    }

    public Track(String name, Album album, String author) {
        this.name = name;
        this.album = album;
        this.authors = new ArrayList<String>() {{
            add(author);
        }};
    }

    public Track(String name, String author) {
        this.name = name;
        this.authors = new ArrayList<String>() {{
            add(author);
        }};
    }

    public Track(String name) {
        this.name = name;
        this.authors = new ArrayList<String>();
    }

    @Override
    public String toString() {
        if (this.album != null && !this.authors.contains(this.album.getAuthor())) {
            this.authors.add(this.album.getAuthor());
        }
        if (this.authors.size() > 1) {
            return this.name + ", авторы: " + String.join(", ", this.authors);
        }
        return this.name + ", автор: " + this.authors.get(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
