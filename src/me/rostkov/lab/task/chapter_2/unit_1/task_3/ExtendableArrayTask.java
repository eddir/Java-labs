package me.rostkov.lab.task.chapter_2.unit_1.task_3;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExtendableArrayTask extends BaseTask implements Task {
    public ExtendableArrayTask() {
        this.id = "2.1.3";
        this.title = "Изменяемый массив";
        this.description = """
                 Данная задача предполагает разработку новой сущности на основе той, что\s
                была получена в задаче 2.1.2. Необходимо разработать сущность СписокЗначений, представляющую\s
                собой такой набор значений, элементы которого можно добавлять, удалять и изменять. В отличии от\s
                сущности 2.1.2 единственным ограничением на количество элементов является максимальный\s
                размер допустимый для массивов.
                """;
    }

    @SuppressWarnings("DuplicatedCode")
    @Override
    public void start(Scanner in) {
        ExtendableArray arr = new ExtendableArray();
        System.out.println(arr);

        arr.add(2);
        System.out.println(arr);

        arr.set(0, 1);
        System.out.println(arr);

        arr.add(new ArrayList<Integer>() {{
            add(3);
            add(4);
            add(5);
        }});
        System.out.println(arr);

        arr.add(new int[]{
                6, 7
        });
        System.out.println(arr);

        arr.remove(5);
        System.out.println(arr);
        System.out.println(arr.get(5));

        arr.set(7, new ArrayList<Integer>() {{
            add(7);
            add(8);
            add(9);
        }});
        System.out.println(arr);

        arr.replace(5, 6);
        System.out.println(arr);

        arr.replace(1, new int[]{2, 4, 6});
        System.out.println(arr);

        arr.replace(3, new ArrayList<Integer>() {{
            add(0);
            add(0);
            add(0);
            add(0);
        }});
        System.out.println(arr);

        System.out.println(arr.isEmpty());
        System.out.println(arr.getSize());

        System.out.println(Arrays.toString(arr.toArray()));
    }
}
