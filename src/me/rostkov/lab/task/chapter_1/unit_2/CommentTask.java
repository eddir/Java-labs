package me.rostkov.lab.task.chapter_1.unit_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

public class CommentTask extends BaseTask implements Task {

    public CommentTask() {
        this.id = "1.2";
        this.title = "Комментарий";
        this.description = "Необходимо разработать сущность Комментарий, которая описывается:\n" +
                "•\tТекст: строка\n" +
                "•\tРейтинг: число\n" +
                "Может возвращать текстовое представление вида “(рейтинг) текст”, например: “(169)  отличные  задачи!”." +
                " Необходимо создать три разных комментария и вывести их на экран.\n";
    }

    @Override
    public void start() {
        Comment comment1 = new Comment("отличные задачи!", 169);
        Comment comment2 = new Comment("комментарий про отличные задачи", 100500);
        Comment comment3 = new Comment("комментарий про комментарий про отличные задачи", -999);

        System.out.println(comment1);
        System.out.println(comment2);
        System.out.println(comment3);
    }
}
