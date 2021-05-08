package me.rostkov.lab.task.chapter_1.unit_3.task_5;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class ArticleTask extends BaseTask implements Task {
    public ArticleTask() {
        this.id = "3.5";
        this.title = "Публикации";
        this.description = "Необходимо разработать сущность Публикация";
    }

    @Override
    public void start(Scanner in) {
        Article article = new Article(
                "История транзистора.",
                "Дорога к твердотельным переключателям была долгой. Она началась с открытия того, что " +
                        "определенные материалы странно ведут себя в присутствии электричества. В 1874 году Фердинанд" +
                        " Браун опубликовал статью “О прохождении электрических токов через сульфиды металлов”. И все" +
                        " завертелось…",
                new String[]{"История", "IT", "электроника"},
                new FullComment[]{
                        new FullComment(
                                "Держите ссылку на то как работают светодиоды из карбида кремния ввв.свет.ру",
                                1,
                                new FullComment[]{
                                        new FullComment("Спасибо!", 0),
                                        new FullComment("Thanks!", 0),
                                }
                        ),
                        new FullComment(
                                "Это перевод? Пойду оригинал почитаю",
                                0,
                                new FullComment[]{
                                        new FullComment(
                                                "а где ссылка на оригинал?",
                                                0,
                                                new FullComment(
                                                        "автор, добавь ссылку в начало статьи",
                                                        3
                                                )
                                        ),
                                }
                        ),
                        new FullComment(
                                "Какую только дичь не писали в журналах 20-30гг пытаясь объяснить работу " +
                                        "кристаллического детектора",
                                5
                        )
                },
                10
        );

        System.out.println(article);
    }
}
