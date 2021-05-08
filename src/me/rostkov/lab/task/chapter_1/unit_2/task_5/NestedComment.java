package me.rostkov.lab.task.chapter_1.unit_2.task_5;

public class NestedComment {

    private String line;
    private int rating;
    private NestedComment parent;

    public NestedComment(String line, int rating, NestedComment parent) {
        this.line = line;
        this.rating = rating;
        this.parent = parent;
    }

    public NestedComment(String line, int rating) {
        this.line = line;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "(" + rating + ") " + line;
    }

    public int countParents() {
        return this.parent == null ? 0 : this.parent.countParents() + 1;
    }

    public String toRepresentation() {
        // TODO: есть более эффективный подход?
        String comments = "";

        if (this.parent != null) {
            comments = this.parent.toRepresentation();
        }

        comments += "\n" + "-".repeat(this.countParents() * 3) + this.toString();
        return comments;
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
