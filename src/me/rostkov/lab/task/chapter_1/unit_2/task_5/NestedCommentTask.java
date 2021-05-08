package me.rostkov.lab.task.chapter_1.unit_2.task_5;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class NestedCommentTask extends BaseTask implements Task {
    public NestedCommentTask() {
        this.id = "2.5";
        this.title = "Комментирование комментариев";
        this.description = "Необходимо так модифицировать сущность Комментарий (из задачи 1.2), что бы была " +
                "возможность оставить Комментарий к Комментарию. ";
    }

    @Override
    public void start(Scanner in) {
        NestedComment comment1 = new NestedComment("отличные задачи!", 169);
        NestedComment comment2 = new NestedComment("совершенно согласен с этим комментарием!", 5, comment1);
        NestedComment comment3 = new NestedComment("что-то я ничего не понял", 0, comment2);

        System.out.println(comment3.toRepresentation());
    }
}
