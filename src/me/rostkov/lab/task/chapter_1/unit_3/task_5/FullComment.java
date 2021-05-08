package me.rostkov.lab.task.chapter_1.unit_3.task_5;

public class FullComment {
    private String line;
    private int rating;
    private FullComment[] parents;

    public FullComment(String line, int rating, FullComment[] parent) {
        this.line = line;
        this.rating = rating;
        this.parents = parent;
    }

    public FullComment(String line, int rating, FullComment parent) {
        this.line = line;
        this.rating = rating;
        this.parents = new FullComment[]{parent};
    }

    public FullComment(String line, int rating) {
        this.line = line;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "(" + rating + ") " + line;
    }

    public int countParents() {
        int count = 0;

        if (this.parents != null) {
            for (FullComment comment : this.parents) {
                count += comment.countParents();
            }
        }
        return this.parents == null ? 0 : count + 1;
    }

    public String toRepresentation() {
        StringBuilder comments = new StringBuilder();

        if (this.parents != null) {
            for (FullComment comment: this.parents) {
                comments.append(comment.toRepresentation());
            }
        }

        comments.append("\n").append("-".repeat(this.countParents() * 3)).append(this.toString());
        return comments.toString();
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
