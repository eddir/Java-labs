package me.rostkov.lab.task.chapter_1.unit_3.task_5;

public class Article {
    private String title;
    private String body;
    private String[] tags;
    private FullComment[] comments;
    private int rating;

    public Article(String title, String body, String[] tags, FullComment[] comments, int rating) {
        this.title = title;
        this.body = body;
        this.tags = tags;
        this.comments = comments;
        this.rating = rating;
    }

    public String toString() {
        //todo: инверсия иерархии
        StringBuilder c = new StringBuilder();

        for(FullComment comment: comments){
            c.append(comment.toRepresentation());
        }

        return String.format("\n(%d) %s\n\nтэги: %s\n\n%s\n\nКомментарии:\n%s",
                rating,
                title,
                String.join(", ", tags),
                body,
                String.join("\n", c));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public FullComment[] getComments() {
        return comments;
    }

    public void setComments(FullComment[] comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
