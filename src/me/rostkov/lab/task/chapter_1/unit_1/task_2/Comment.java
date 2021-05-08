package me.rostkov.lab.task.chapter_1.unit_1.task_2;

public class Comment {

    private String line;
    private int rating;

    public Comment(String line, int rating) {
        this.line = line;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "(" + rating + ") " + line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
