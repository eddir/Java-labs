package me.rostkov.lab.task.chapter_2.unit_1.task_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NonExtendedArrayTask extends BaseTask implements Task {
    public NonExtendedArrayTask() {
        this.id = "2.1.2";
        this.title = "Неудлияемый массив";
        this.description = """
                Данная задача предполагает разработку новой сущности на основе той,\s
                что была получена в задаче 2.1.1. Необходимо разработать сущность НеудлиняемыйСписокЗначений,\s
                представляющую собой такой набор значений, элементы которого можно добавлять и удалять, однако\s
                максимально возможное количество элементов известно заранее.""";
    }

    @Override
    public void start(Scanner in) {
//        NonExtendedArray z = new NonExtendedArray(10);
//        z.add(1);
//        z.add(2);
//        System.out.println(z);
//        z.set(4, new int[]{3, 4, 5, 6, 7});
//        System.out.println(z);

        NonExtendedArray arr = new NonExtendedArray(10);
        System.out.println(arr);

        arr.add(2);
        System.out.println(arr);

        arr.set(0, 1);
        System.out.println(arr);

        arr.add(new ArrayList<Integer>(){{
            add(3);
            add(4);
            add(5);
        }});
        System.out.println(arr);

        arr.add(new int[] {
            6, 7
        });
        System.out.println(arr);

        arr.remove(5);
        System.out.println(arr);
        System.out.println(arr.get(5));

        arr.set(7, new ArrayList<Integer>(){{
            add(7);
            add(8);
            add(9);
        }});
        System.out.println(arr);

        arr.replace(5, 6);
        System.out.println(arr);

        arr.replace(1, new int[]{2, 4, 6});
        System.out.println(arr);

        arr.replace(3, new ArrayList<Integer>(){{
            add(0);
            add(0);
            add(0);
            add(0);
        }});
        System.out.println(arr);

        System.out.println(arr.isEmpty());
        System.out.println(arr.isFree());
        System.out.println(arr.getSize());

        System.out.println(Arrays.toString(arr.toArray()));
    }
}
